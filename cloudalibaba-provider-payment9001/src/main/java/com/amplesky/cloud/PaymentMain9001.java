package com.amplesky.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/8/18 0018 14:06
 */

@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9001 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMain9001.class,args);
    }
}
