package com.amplesky.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/8/25 0025 22:52
 */
@RestController
public class FlowLimitController {
    
    @GetMapping("/testA")
    public String testA(){
        return "testA";
    }
    @GetMapping("/testB")
    public String testB(){
        return "testB";
    }
}
