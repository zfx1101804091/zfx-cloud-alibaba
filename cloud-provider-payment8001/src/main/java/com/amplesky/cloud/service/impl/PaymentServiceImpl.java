package com.amplesky.cloud.service.impl;

import com.amplesky.cloud.dao.PaymentDao;
import com.amplesky.cloud.entitles.Payment;
import com.amplesky.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/8/17 0017 23:48
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    
    @Resource
    private PaymentDao paymentDao;
    
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
