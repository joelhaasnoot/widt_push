package nl.waarisdetrein.api.push.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by joelthuis on 07/10/14.
 */
public class PostNotificationCommand extends HystrixCommand<Boolean> {

    private final String message;
    private final String user;

    public PostNotificationCommand(String user, String message) {
        super(HystrixCommandGroupKey.Factory.asKey("PushoverGroup"));
        this.user = user;
        this.message = message;
    }

    @Override
    protected Boolean run() throws Exception {
        MultivaluedHashMap<String, String> params = new MultivaluedHashMap<String, String>();
        params.put("token", Arrays.asList("GUjFheDzQin1PiEJqoV8JFcOvAQ2Se"));
        params.put("user", Arrays.asList(user));
        params.put("message", Arrays.asList(message));
        Client c = ClientBuilder.newClient();
        c.target("https://api.pushover.net/1/")
                .path("messages.json")
                .request(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.form(params));

        return null;
    }
}
