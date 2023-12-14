package com.example.lightstorage.controller;

import com.example.lightstorage.dto.Message;
import com.example.lightstorage.dto.ResultEnum;
import com.example.lightstorage.service.SearchService;
import com.example.lightstorage.vo.SearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    SearchService searchService;

    @GetMapping("/pai/public/v1/lamp/search")
    public SearchVO searchLampByName(String query,Integer cid,Integer pagenum,Integer pagesize){

        SearchVO searchVO=new SearchVO();

        Message message = searchService.searchLampByName(query, cid, pagenum, pagesize);
        searchVO.setMessage(message);
        searchVO.setMeta(ResultEnum.SUCCESS);

        return searchVO;
    }

}
