package com.flk.cloud.seatastorageservice2002.domain;

/**
 * @author ：fanlikuo
 * @description：TODO
 * @date ：2022/3/2 18:17
 */
import lombok.Data;

@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}