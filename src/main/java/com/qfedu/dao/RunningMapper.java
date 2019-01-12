package com.qfedu.dao;

import com.qfedu.entity.Running;

public interface RunningMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Running record);

    int insertSelective(Running record);

    Running selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Running record);

    int updateByPrimaryKey(Running record);

    Running select();

    Running selectByRname(String rname);
}