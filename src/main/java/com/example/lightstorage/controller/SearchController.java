package com.example.lightstorage.controller;

import com.example.lightstorage.dto.Message;
import com.example.lightstorage.dto.ResultBean;
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
        searchVO.setMeta(ResultBean.error());

        /*
        * 关键词为空
        * */
        if(query == null){
            return searchVO;
        }
        Message message = searchService.searchLampByName(query, cid, pagenum, pagesize);

        /*
        * 找不到数据
        * */
        if(message == null){
            return searchVO;
        }

        searchVO.setMessage(message);
        searchVO.setMeta(ResultBean.success());

        return searchVO;
    }

}
