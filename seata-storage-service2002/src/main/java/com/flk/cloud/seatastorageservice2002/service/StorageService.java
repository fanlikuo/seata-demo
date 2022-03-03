package com.flk.cloud.seatastorageservice2002.service;

/**
 * @author ：fanlikuo
 * @description：TODO
 * @date ：2022/3/2 18:18
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}