package com.qfedu.service.impl;

import com.qfedu.dao.UserMapper;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper userMapper;
    @Override
    public boolean savaUser(User user) {
        return userMapper.insertSelective(user);
    }
}
