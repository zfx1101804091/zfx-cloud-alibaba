package com.amplesky.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/8/18 0018 14:28
 */
@Configuration
public class ApplicationContextConfig
{
    /*
        @LoadBalanced ： nacos天生支持负载均衡（因为集成了ribbon），所以当一个服务有多个实例的时候需要加此注解
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
 