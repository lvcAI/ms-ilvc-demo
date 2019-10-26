package me.ilvc.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lvc
 * @create 2019/10/25 16:16
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {

    @Value("${clientParam}")
    private String clientParam;

    @RequestMapping("/clientParam")
    public String getParam() {
        return this.clientParam;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }


    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
