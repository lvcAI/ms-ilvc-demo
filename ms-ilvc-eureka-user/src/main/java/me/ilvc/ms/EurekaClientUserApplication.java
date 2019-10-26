package me.ilvc.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lvc
 * @create 2019/10/24 21:15
 */
@SpringBootApplication
@RestController
@Configuration
public class EurekaClientUserApplication {

    @RequestMapping("/hello")
    public String home(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientUserApplication.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
