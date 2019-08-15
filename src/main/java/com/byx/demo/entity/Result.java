package com.byx.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
/**
 * 返回数据的封装
 */
public class Result<T> {
    private String message;
    private Boolean success;
    private T detail;
}
