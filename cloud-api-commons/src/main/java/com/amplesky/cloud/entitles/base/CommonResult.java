package com.amplesky.cloud.entitles.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: JSON返回实体
 * @author: zheng-fx
 * @time: 2020/8/17 0017 23:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
 
 
