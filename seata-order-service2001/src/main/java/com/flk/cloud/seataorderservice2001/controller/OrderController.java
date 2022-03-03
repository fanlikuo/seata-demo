package com.flk.cloud.seataorderservice2001.controller;

import com.flk.cloud.seataorderservice2001.domain.CommonResult;
import com.flk.cloud.seataorderservice2001.service.OrderService;
import com.flk.cloud.seataorderservice2001.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：fanlikuo
 * @description：TODO
 * @date ：2022/3/2 14:42
 */
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("create")
    public CommonResult create(Order order){
        orderService.createOrder(order);
        return new CommonResult(200,"创建成功");
    }

}
