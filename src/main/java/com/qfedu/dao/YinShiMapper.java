package com.qfedu.dao;

import com.qfedu.entity.YinShi;

import java.util.List;

public interface YinShiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YinShi record);

    int insertSelective(YinShi record);

    YinShi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YinShi record);

    int updateByPrimaryKey(YinShi record);

    List<YinShi> selectAll();
}