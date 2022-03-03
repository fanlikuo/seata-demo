package com.flk.cloud.seataorderservice2001.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ：fanlikuo
 * @description：TODO
 * @date ：2022/3/2 14:31
 */
@Data
public class Order {
    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    private Integer status; //订单状态：0：创建中；1：已完结

}
