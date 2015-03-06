package nl.waarisdetrein.api.push.service;

import nl.waarisdetrein.api.push.WidtPushApplication;
import nl.waarisdetrein.api.push.util.ZeroMQUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zeromq.ZMQ;
import org.zeromq.ZMsg;

import java.util.concurrent.TimeUnit;

/**
* Created by joelthuis on 07/10/14.
*/
public class ZmqReceiveTask implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(ZmqReceiveTask.class.getSimpleName());

    private final String[] dvsPublishers = new String[] {"tcp://langano.joelhaasnoot.nl:7660"};

    private final int port;
    int addressPointer = 0;

    public ZmqReceiveTask(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        LOG.info("Started ZMQ receiver");

        ZMQ.Context receiveContext = ZMQ.context(1);
        ZMQ.Socket subscriber = receiveContext.socket(ZMQ.SUB);
        subscriber.connect(dvsPublishers[addressPointer]);
        subscriber.subscribe("".getBytes());

        ZMQ.Socket push = receiveContext.socket(ZMQ.PUSH);
        push.bind("tcp://*:" + port);

        LOG.info("Connect to " + dvsPublishers[addressPointer]);
        ZMQ.Poller poller = receiveContext.poller();
        poller.register(subscriber);

        while (!Thread.interrupted()) {
            if (poller.poll(TimeUnit.MINUTES.toMillis(5L)) > 0){
                try{
                    String[] m = ZeroMQUtils.gunzipMultifameZMsg(ZMsg.recvMsg(subscriber));
                    push.send(m[1]);
                } catch (Exception e) {
                    LOG.error("Error in DVS receiving", e);
                    e.printStackTrace();
                }
            } else {
                subscriber.disconnect(dvsPublishers[addressPointer]);
                addressPointer++;
                if (addressPointer >= dvsPublishers.length){
                    addressPointer = 0;
                }
                LOG.error("Connection to {} lost, reconnecting", dvsPublishers[addressPointer]);
                subscriber.connect(dvsPublishers[addressPointer]);
                subscriber.subscribe("".getBytes());
            }
        }

        subscriber.disconnect(dvsPublishers[addressPointer]);
    }
}
