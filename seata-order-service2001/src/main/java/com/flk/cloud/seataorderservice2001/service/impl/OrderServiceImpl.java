package com.flk.cloud.seataorderservice2001.service.impl;

import com.flk.cloud.seataorderservice2001.dao.OrderDao;
import com.flk.cloud.seataorderservice2001.service.AccountService;
import com.flk.cloud.seataorderservice2001.service.OrderService;
import com.flk.cloud.seataorderservice2001.service.StorageService;
import com.flk.cloud.seataorderservice2001.domain.Order;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：fanlikuo
 * @description：TODO
 * @date ：2022/3/2 14:40
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;
    @GlobalTransactional(name="fsp-create-order",rollbackFor=Exception.class)
    @Override
    public void createOrder(Order order) {
        log.info("=====>{}","开始新建订单");
        orderDao.createOrder(order);
        log.info("=====>{}","新建订单成功");
        log.info("=====>{}","库存减少");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("=====>{}","库存减少成功");
        log.info("=====>{}","开始减少余额");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("=====>{}","减少余额成功");

        log.info("=====>{}","开始修改订单状态");
        orderDao.updateStatus(order.getUserId(),0);
        log.info("=====>{}","修改订单状态成功");

        log.info("=====>{}","end");
    }
}
