package com.example.lightstorage.dto;

import com.example.lightstorage.entity.Lamp_Msg;
import lombok.Data;

import java.util.ArrayList;

/*
* 查询信息封装类
* */
@Data
public class Message {

    //搜索总记录条数
    private Integer total;
    //页数索引
    private Integer pagenum;
    //车灯信息
    private ArrayList<Lamp_Msg> lamp;

}
