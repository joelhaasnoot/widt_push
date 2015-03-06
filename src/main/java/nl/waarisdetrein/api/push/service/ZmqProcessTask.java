package nl.waarisdetrein.api.push.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ndov.cdm.trein.reisinformatie.data._2.DynamischeVertrekStaatType;
import ndov.cdm.trein.reisinformatie.data._2.ReisInformatieProductDVSType;
import ndov.cdm.trein.reisinformatie.messages._3.PutReisInformatieBoodschapIn;
import nl.waarisdetrein.api.push.WidtPushApplication;
import nl.waarisdetrein.api.push.command.PostNotificationCommand;
import nl.waarisdetrein.api.push.domain.MonitorRequest;
import nl.waarisdetrein.api.push.util.DvsToMessageConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zeromq.ZMQ;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/**
* Created by joelthuis on 07/10/14.
*/
public class ZmqProcessTask implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(ZmqProcessTask.class.getSimpleName());
    private final int port;

    private ZMQ.Context processContext = ZMQ.context(1);
    private final MonitorRequestService monitorService = MonitorRequestService.getInstance();

    public ZmqProcessTask(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        LOG.info("Started ZMQ pusher ");

        ZMQ.Socket pull = processContext.socket(ZMQ.PULL);
        pull.connect("tcp://127.0.0.1:"+ port);

        Unmarshaller unmarshaller = getUnmarshaller(PutReisInformatieBoodschapIn.class);
        while (!Thread.interrupted()) {
            try {
                String m = pull.recvStr();
                InputStream stream = new ByteArrayInputStream(m.getBytes("UTF-8"));
                JAXBElement<PutReisInformatieBoodschapIn> feed = unmarshaller.unmarshal(new StreamSource(stream), PutReisInformatieBoodschapIn.class);
                DynamischeVertrekStaatType dvs = feed.getValue().getReisInformatieProductDVS().getDynamischeVertrekStaat();

                handleMessage(dvs);

            } catch (Exception e) {
                LOG.error("Error in DVS processing", e);
            }
        }
    }

    private Unmarshaller getUnmarshaller(Class c) {
        JAXBContext jc;
        Unmarshaller unmarshaller = null;
        try {
            jc = JAXBContext.newInstance(c);
            unmarshaller = jc.createUnmarshaller();
            unmarshaller.setEventHandler(new javax.xml.bind.helpers.DefaultValidationEventHandler());
        } catch (JAXBException e1) {
            LOG.error("Error with JAXB", e1);
        }
        return unmarshaller;
    }

    private void handleMessage(DynamischeVertrekStaatType dvs) {
        if (monitorService.hasService(dvs.getTrein().getTreinNummer())) {
            List<MonitorRequest> list = monitorService.getMonitorsForService(dvs.getTrein().getTreinNummer());
            for (MonitorRequest r : list) {
                PostNotificationCommand command = new PostNotificationCommand(r.getPushIdentifier(),
                        DvsToMessageConverter.convertDvs(dvs));
                command.execute();
            }
        }

        if (monitorService.hasStation(dvs.getRitStation().getStationCode())) {
            List<MonitorRequest> list = monitorService.getMonitorsForStation(dvs.getRitStation().getStationCode());
            for (MonitorRequest r : list) {
                PostNotificationCommand command = new PostNotificationCommand(r.getPushIdentifier(),
                        DvsToMessageConverter.convertDvs(dvs));
                command.execute();
            }
        }
    }
}
