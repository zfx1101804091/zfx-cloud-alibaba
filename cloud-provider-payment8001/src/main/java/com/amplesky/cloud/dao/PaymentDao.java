package com.amplesky.cloud.dao;

import com.amplesky.cloud.entitles.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/8/17 0017 23:33
 */
@Mapper
public interface PaymentDao {
    
    //功能描述: 写入payment
    public int create(Payment payment);
    
    //功能描述: 读取payment
    public Payment getPaymentById(@Param("id") Long id);
}
