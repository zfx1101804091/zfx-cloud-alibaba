package com.amplesky.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/8/18 0018 01:16
 */
@Configuration
public class ApplicationContextConfig {

    /*
       替换RestTemplate默认依赖JDK提供http连接的能力HttpURLConnection 
       使用OkHttp的性能优越
    */
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate(new OkHttp3ClientHttpRequestFactory());
        //消息转换列表(解决获取百度的网页内容(responseEntity.getBody())。 网页内容中中文乱码)
        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        //配置消息转换器StringHttpMessageConverter，并设置utf‐8
        //支持中文字符集，默认ISO‐ 8859‐1，支持utf‐8
        messageConverters.set(1,new StringHttpMessageConverter(StandardCharsets.UTF_8));
        return restTemplate;
    }
}
