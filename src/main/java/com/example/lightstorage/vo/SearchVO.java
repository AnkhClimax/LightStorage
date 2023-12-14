package com.example.lightstorage.vo;

import com.example.lightstorage.dto.Message;
import com.example.lightstorage.dto.ResultEnum;
import lombok.Data;

@Data
public class SearchVO {

    private Message message;
    private ResultEnum meta;
}
