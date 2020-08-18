package com.amplesky.cloud.controller;

import com.amplesky.cloud.entitles.Payment;
import com.amplesky.cloud.entitles.base.CommonResult;
import com.amplesky.cloud.service.PaymentService;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/8/17 0017 23:51
 */
@RestController
@Slf4j
public class PaymentController {
    
    @Autowired
    private PaymentService paymentService;

    /**
     *  对于远程调用该服务 需要加 @RequestBody 注解
     * @param payment
     * @return
     */
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result>0){
            log.info("新增成功： {}",payment);
            return new CommonResult(200,"插入成功");
        }else {
            log.info("新增失败");
            return new CommonResult(444,"插入失败");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult get(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment!=null){
            log.info("查询成功： {}",payment);
            return new CommonResult(200,"查询成功",payment);
        }else {
            log.info("查询失败--ID ： {}",id);
            return new CommonResult(444,"插入失败，失败ID为"+id,null);
        }
    }
}
