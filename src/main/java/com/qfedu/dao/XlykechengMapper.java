package com.qfedu.dao;

import com.qfedu.entity.Xlykecheng;

import java.util.List;

public interface XlykechengMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Xlykecheng record);

    int insertSelective(Xlykecheng record);

    Xlykecheng selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Xlykecheng record);

    int updateByPrimaryKey(Xlykecheng record);

    List<Xlykecheng> select();

}