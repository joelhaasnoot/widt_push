package nl.waarisdetrein.api.push;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by joelthuis on 07/10/14.
 */
@ApplicationPath("/")
public class WidtPushApplication extends ResourceConfig {


    public WidtPushApplication() {
        packages("nl.waarisdetrein.api.push");
    }
}
