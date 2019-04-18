package cloud.cirrusup.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@ImportResource(locations = "classpath:spring-config/applicationContext.xml")
@PropertySource("classpath:properties/config-${spring.profiles.active}.properties")
public class CirrusCloudDemoController {

    private static final Logger LOG = LoggerFactory.getLogger(CirrusCloudDemoController.class);

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {

        LOG.info("GET /hello request.");
        return "Hello, " + name + "!";
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam String name) {

        LOG.info("GET /hello2 request.");
        return "Hello, " + name + "!";
    }
}
