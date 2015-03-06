package nl.waarisdetrein.api.push.domain;

import ndov.cdm.trein.reisinformatie.data._2.DynamischeVertrekStaatType;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by joelthuis on 30/09/14.
 */
public class MonitorRequest {

    private String id;

    private int serviceId;
    private List<String> stations;

    private PushType type;
    private String pushIdentifier;


    public boolean matches(DynamischeVertrekStaatType input) {
        if (!input.getRitId().equals(serviceId)) {
            return false;
        }

//        if ((stations.size() == 1 && !stations.get(0).equals("*")) ||
//                !stations.contains(input.getRitStation().getStationCode().toLowerCase())) {
//            return false;
//        }

        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getServiceId() {
        return serviceId;
    }

    public List<String> getStations() {
        return stations;
    }

    public String getPushIdentifier() {
        return pushIdentifier;
    }

    private enum PushType {
        ANDROID,
        IPHONE,
        PUSHOVER;
    }
}
