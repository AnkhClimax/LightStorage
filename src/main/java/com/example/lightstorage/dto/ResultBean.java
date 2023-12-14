package com.example.lightstorage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultBean {

    private String msg;
    private Integer status;

    public static ResultBean success(){
        return new ResultBean(ResultEnum.SUCCESS.getMsg(), ResultEnum.SUCCESS.getStatus());
    }

    public static ResultBean error(){
        return new ResultBean(ResultEnum.ERROR.getMsg(), ResultEnum.ERROR.getStatus());
    }
}
