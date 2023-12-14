package com.example.lightstorage.mapper;

import com.example.lightstorage.dto.Message;
import com.example.lightstorage.entity.Lamp_Msg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface SearchMapper {

    /*
    * 查询车灯信息总条数记录
    * */
    Message searchTotal();

    /*
    * 根据名字搜索车灯信息
    * */
    ArrayList<Lamp_Msg> searchLampByName(@Param("query")String query,
                                         @Param("pagenum")Integer pagenum, @Param("pagesize")Integer pagesize);
}
