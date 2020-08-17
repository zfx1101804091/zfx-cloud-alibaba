package com.amplesky.cloud.service;

import com.amplesky.cloud.entitles.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/8/17 0017 23:47
 */
public interface PaymentService {

    //功能描述: 写入payment
    public int create(Payment payment);

    //功能描述: 读取payment
    public Payment getPaymentById(Long id);
}
