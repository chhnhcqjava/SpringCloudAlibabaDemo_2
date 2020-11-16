package com.example.orderserviceprovider.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hcq
 * @date 2020/11/16 12:42
 */
@RequestMapping("order")
@RestController
public class OrderController {

    @RequestMapping("/now")
    public Long now() {
        return System.currentTimeMillis();
    }
}
