package com.qfedu.dao;

import com.qfedu.entity.BaiKe;
import com.qfedu.entity.ShiPu;

import java.util.List;
import java.util.Map;

public interface ShiPuMapper {
    int deleteByPrimaryKey(Integer id);

    boolean insert(ShiPu record);

    int insertSelective(ShiPu record);

    ShiPu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShiPu record);

    int updateByPrimaryKey(ShiPu record);

    int selectCount();

    List<ShiPu> select(Map<String,Object> param);
}