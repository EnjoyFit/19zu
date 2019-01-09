package com.qfedu.dao;

import com.qfedu.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    boolean insert(User record);

    boolean insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByNameAndPass(String username, String password);
}