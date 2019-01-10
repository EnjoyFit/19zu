package com.qfedu.dao;

import com.qfedu.entity.BaiKe;

import java.util.List;
import java.util.Map;

public interface BaiKeMapper {
    int deleteByPrimaryKey(Integer id);

    boolean insert(BaiKe record);

    int insertSelective(BaiKe record);

    BaiKe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaiKe record);

    int updateByPrimaryKey(BaiKe record);

    int selectCount();

    List<BaiKe> selectByPage(Map<String,Object> param);
}