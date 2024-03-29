package cloud.cirrusup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Service entry point.
 */
@SpringBootApplication
@EnableZuulProxy
public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOG.info("Starting application... ");
        SpringApplication.run(Application.class, args);
    }
}
