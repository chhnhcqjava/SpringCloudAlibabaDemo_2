package com.example.orderserviceprovider.order;

import com.example.orderserviceapi.order.OrderService;
import org.apache.dubbo.config.annotation.Service;


/**
 * @author hcq
 * @date 2020/11/16 11:32
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String placeAnOrder(String shopName) {
        return String.format("下单成功,商品名称：%s,订单号：%s", shopName, System.currentTimeMillis());
    }
}
