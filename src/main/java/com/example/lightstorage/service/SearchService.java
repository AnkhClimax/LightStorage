package com.example.lightstorage.service;

import com.example.lightstorage.dto.Message;

public interface SearchService {

    Message searchLampByName(String query,Integer cid,Integer pagenum,Integer pagesize);
}
