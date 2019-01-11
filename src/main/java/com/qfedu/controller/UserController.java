package com.qfedu.controller;

import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是第十九组编写的接口文档",value = "接口文档")
@RestController
public class UserController {


    @Autowired
    private UserService uservice;

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"对象"},value = "登录的接口")
    @PostMapping("savauser.do")
    @CrossOrigin
    private ResultVo savaUser(@ApiParam(value = "111") User user) {
       boolean b = uservice.savaUser(user);

        if(b) {
            return ResultVo.setOK(null);

        }else {
            return ResultVo.setERROR();

        }
    }

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"对象"},value = "注册的接口")
    @GetMapping("login.do")

    private  ResultVo login(String username, String password) {
        ResultVo sf = uservice.login(username, password);

        return sf;
    }


}
