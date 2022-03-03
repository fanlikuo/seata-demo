package com.flk.cloud.seataorderservice2001.service;

import com.flk.cloud.seataorderservice2001.domain.Order;

/**
 * @author ：fanlikuo
 * @description：TODO
 * @date ：2022/3/2 14:35
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void createOrder(Order order);
}
