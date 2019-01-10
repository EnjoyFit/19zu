package com.qfedu.service;


import com.qfedu.entity.User;
import com.qfedu.vo.ResultVo;

public interface UserService {

    //进行用户注册
    public  boolean savaUser(User user);

    //进行用户登录
    ResultVo login(String username, String password);
}
