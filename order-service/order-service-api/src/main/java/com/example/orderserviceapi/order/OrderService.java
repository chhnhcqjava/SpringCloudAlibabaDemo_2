package com.example.orderserviceapi.order;

/**
 * @author hcq
 * @date 2020/11/16 11:29
 */
public interface OrderService {

    /**
     * 下单
     * @param shopName 商品名称
     * @return orderId
     */
    String placeAnOrder(String shopName);
}
