package com.qfedu.dao;

import com.qfedu.entity.Jstrain;

public interface JstrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jstrain record);

    int insertSelective(Jstrain record);

    Jstrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jstrain record);

    int updateByPrimaryKey(Jstrain record);

    Jstrain select();
}