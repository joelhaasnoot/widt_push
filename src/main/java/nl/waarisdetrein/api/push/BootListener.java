package nl.waarisdetrein.api.push;


import nl.waarisdetrein.api.push.service.ZmqProcessTask;
import nl.waarisdetrein.api.push.service.ZmqReceiveTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by joelthuis on 05/03/15.
 */
@WebListener
public class BootListener implements ServletContextListener {

    private static final int ZMQ_PORT = 54201;
    private static final Logger LOG = LoggerFactory.getLogger(BootListener.class.getSimpleName());
    private final ExecutorService pool = Executors.newFixedThreadPool(2);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOG.info("Got startup");
        pool.execute(new ZmqReceiveTask(ZMQ_PORT));
        pool.execute(new ZmqProcessTask(ZMQ_PORT));
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOG.info("Got shutdown");
        pool.shutdown();
    }
}