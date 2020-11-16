package com.example.orderserviceconsumer.controler;

import com.example.orderserviceapi.order.OrderService;
import com.example.orderserviceconsumer.service.OrderServiceFeign;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hcq
 * @date 2020/11/16 12:20
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Reference
    OrderService orderService;

    @Resource
    OrderServiceFeign orderServiceFeign;

    @GetMapping("/placeAnOrder")
    public String placeAnOrder(String shopName) {
        return orderService.placeAnOrder(shopName);
    }

    @GetMapping("/now")
    public String now() {
        return orderServiceFeign.now();
    }

}
