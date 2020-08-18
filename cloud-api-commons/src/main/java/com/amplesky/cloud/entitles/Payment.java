package com.amplesky.cloud.entitles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/8/17 0017 23:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    
    private Long id;
    private String serial;
    
}
