package com.example.lightstorage.service.impl;

import com.example.lightstorage.dto.Message;
import com.example.lightstorage.entity.Lamp_Msg;
import com.example.lightstorage.mapper.SearchMapper;
import com.example.lightstorage.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    SearchMapper searchMapper;

    @Override
    public Message searchLampByName(String query, Integer cid, Integer pagenum, Integer pagesize) {

        //查询总条数
        Message message = searchMapper.searchTotal();
        //查询车灯信息并分页
        ArrayList<Lamp_Msg> lamp_msgs = searchMapper.searchLampByName(query, pagenum, pagesize);

        message.setLamp(lamp_msgs);
        message.setPagenum(pagenum);

        return message;
    }
}
