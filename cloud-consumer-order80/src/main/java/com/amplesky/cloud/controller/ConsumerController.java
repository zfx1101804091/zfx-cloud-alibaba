package com.amplesky.cloud.controller;

import com.amplesky.cloud.base.CommonResult;
import com.amplesky.cloud.entitles.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/8/17 0017 23:51
 */
@RestController
@Slf4j
public class ConsumerController {
    
    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    /*
        客户端都是GET 请求
     */
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
      
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
