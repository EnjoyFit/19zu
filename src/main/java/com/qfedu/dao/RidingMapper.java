package com.qfedu.dao;

import com.qfedu.entity.Riding;

import java.util.List;

public interface RidingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Riding record);

    int insertSelective(Riding record);

    Riding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Riding record);

    int updateByPrimaryKey(Riding record);
    List<Riding> select();
}