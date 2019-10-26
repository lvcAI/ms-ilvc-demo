package me.ilvc.ms.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lvc
 * @create 2019/10/24 22:33
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findOrderByUser/{id}")
    @HystrixCommand(fallbackMethod = "fallbackInfo")
    public String findOrderByUser(@PathVariable("id") int id) {
        int oid =123;
        return this.restTemplate.getForObject("http://ms-ilvc-eureka-order/order/" + oid, String.class);
    }

    public String fallbackInfo(int id) {
        return "服务不可用，请稍后在试！";
    }

}
