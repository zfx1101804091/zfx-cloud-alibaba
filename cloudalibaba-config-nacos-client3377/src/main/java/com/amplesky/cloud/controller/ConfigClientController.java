package com.amplesky.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 
 *  TODO @RefreshScope 原生注解实现自动更新
 *  
 * @author: zheng-fx
 * @time: 2020/8/18 0018 20:27
 */
@RefreshScope
@RestController
@Slf4j
public class ConfigClientController {
    
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
