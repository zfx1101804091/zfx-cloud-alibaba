package com.amplesky.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/8/18 0018 14:24
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerMain83 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain83.class,args);
    }
}
