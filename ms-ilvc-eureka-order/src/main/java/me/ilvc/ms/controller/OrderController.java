package me.ilvc.ms.controller;

import me.ilvc.ms.po.Order;
import me.ilvc.ms.util.ServiceInfoUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lvc
 * @create 2019/10/24 22:46
 */
@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/order/{id}")
    public String findOrderById(@PathVariable("id") int id) {
        Order order = new Order("123", 998.00, "gexia", "iLvc", "2131231232");
        System.out.println("服务运行端口："+port);
        return order.toString();
    }
}
