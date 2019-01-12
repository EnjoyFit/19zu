package com.qfedu.dao;

import com.qfedu.entity.Jstrain;

import java.util.List;

public interface JstrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jstrain record);

    int insertSelective(Jstrain record);

    Jstrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jstrain record);

    int updateByPrimaryKey(Jstrain record);

    List<Jstrain> select();
}