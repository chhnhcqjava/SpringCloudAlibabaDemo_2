package com.example.orderserviceconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hcq
 * @date 2020/11/16 14:00
 */
@FeignClient("order-privoder")
public interface OrderServiceFeign {

    @RequestMapping(value = "/order/now", method = RequestMethod.GET)
    String now();
}
