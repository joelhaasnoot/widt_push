package nl.waarisdetrein.api.push.resources;

import nl.waarisdetrein.api.push.domain.MonitorRequest;
import nl.waarisdetrein.api.push.service.MonitorRequestService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.UUID;

/**
 * Created by joelthuis on 30/09/14.
 */
@Path("/monitor")
@Produces("application/json")
@Consumes("application/json")
public class MonitorResource {

    private MonitorRequestService service;

    public MonitorResource() {
        this.service = MonitorRequestService.getInstance();
    }

    @POST
    public Response createMonitor(MonitorRequest request) {
        request.setId(UUID.randomUUID().toString());
        service.addMonitor(request);
        return Response.ok().entity(request).build();
    }

    @GET
    @Path("/{id}")
    public Response getMonitor(@PathParam("id") String id) {
        MonitorRequest req = service.getMonitor(id);
        if (req != null) {
            return Response.ok().entity(req).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

    }

    @DELETE
    @Path("/{id}")
    public Response deleteMonitor(@PathParam("id") String id) {
        if (service.deleteMonitor(id)) {
            return Response.noContent().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
