package nl.waarisdetrein.api.push.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import nl.waarisdetrein.api.push.domain.MonitorRequest;
/**
 * Created by joelthuis on 30/09/14.
 */
public class MonitorRequestService {

    private HashMap<String, MonitorRequest> idIndex = new HashMap<String, MonitorRequest>();
    private HashMap<Integer, List<MonitorRequest>> serviceIndex = new HashMap<Integer, List<MonitorRequest>>();
    private HashMap<String, List<MonitorRequest>> stationIndex = new HashMap<String, List<MonitorRequest>>();


    private static MonitorRequestService instance;

    public static synchronized MonitorRequestService getInstance() {
        if (instance == null) {
            instance = new MonitorRequestService();
        }
        return instance;
    }

    public void addMonitor(MonitorRequest req) {
        idIndex.put(req.getId(), req);

        if (req.getServiceId() > 0) {
            if (!serviceIndex.containsKey(req.getServiceId())) {
                serviceIndex.put(req.getServiceId(), new ArrayList<MonitorRequest>());
            }
            serviceIndex.get(req.getServiceId()).add(req);
        } else if (req.getServiceId() == 0) { /* Station */
            if (!stationIndex.containsKey(req.getServiceId())) {
                stationIndex.put(req.getStations().get(0), new ArrayList<MonitorRequest>());
            }
            stationIndex.get(req.getStations().get(0)).add(req);
        }
    }

    public MonitorRequest getMonitor(String id) {
        return idIndex.get(id);
    }

    public boolean deleteMonitor(String id) {
        if (idIndex.containsKey(id)) {
            MonitorRequest req = idIndex.get(id);

            // Clean up other index
            if (req.getServiceId() > 0) {
                serviceIndex.get(req.getServiceId()).remove(req);
            } else {
                stationIndex.get(req.getStations().get(0)).remove(req);
            }
            idIndex.remove(req);

            return true;
        }
        return false;
    }

    public boolean hasService(Integer service) {
        return serviceIndex.containsKey(service);
    }

    public boolean hasStation(String station) {
        return stationIndex.containsKey(station);
    }

    public List<MonitorRequest> getMonitorsForService(Integer service) {
        if (hasService(service)) {
            return serviceIndex.get(service);
        }
        return new ArrayList<MonitorRequest>();
    }

    public List<MonitorRequest> getMonitorsForStation(String station) {
        if (hasStation(station)) {
            return stationIndex.get(station);
        }
        return new ArrayList<MonitorRequest>();
    }

}
