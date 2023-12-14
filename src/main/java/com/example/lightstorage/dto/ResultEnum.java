package com.example.lightstorage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor

public enum ResultEnum {

    //通用响应
    SUCCESS("获取成功",200),
    ERROR("获取失败",404);

    private final String msg;
    private final Integer status;
}
