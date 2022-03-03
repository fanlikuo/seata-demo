package com.flk.cloud.seataorderservice2001.dao;

import com.flk.cloud.seataorderservice2001.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * @author ：fanlikuo
 * @description：TODO
 * @date ：2022/3/2 14:33
 */
@Mapper
public interface OrderDao {
    /**
     * 创建订单
     * @param order
     */
    void createOrder(Order order);

    /**
     * 更新订单
     * @param userId
     * @param status
     */
    void updateStatus(@Param("userId") Long userId, @Param("status") Integer status);

}
