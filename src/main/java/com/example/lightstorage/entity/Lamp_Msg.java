package com.example.lightstorage.entity;

import lombok.Data;

/*
* 车灯表实体类
* */
@Data
public class Lamp_Msg {

    //车灯id
    private Integer lamp_id;
    //分类id
    private Integer cat_id;
    //车灯名称
    private String lamp_name;
    //车灯重量
    private Integer lamp_weight;
    //车灯大图标url
    private String lamp_big_logo;
    //车灯小图标url
    private String lamp_small_logo;
    //车灯添加时间
    private Integer add_time;
    //车灯更新时间
    private Integer upd_time;

}
