package com.qfedu.dao;

import com.qfedu.entity.Yjclass;

import java.util.List;

public interface YjclassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yjclass record);

    int insertSelective(Yjclass record);

    Yjclass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Yjclass record);

    int updateByPrimaryKey(Yjclass record);

    List<Yjclass> select();
}