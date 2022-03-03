package com.flk.cloud.seatastorageservice2002.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：fanlikuo
 * @description：TODO
 * @date ：2022/3/2 18:19
 */


@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     **/
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
