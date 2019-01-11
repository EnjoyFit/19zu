package com.qfedu.dao;

import com.qfedu.entity.KeCheng;

import java.util.List;

public interface KeChengMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KeCheng record);

    int insertSelective(KeCheng record);

    KeCheng selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KeCheng record);

    int updateByPrimaryKey(KeCheng record);

    List<KeCheng> selectAll();
}