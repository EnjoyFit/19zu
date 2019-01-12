package com.qfedu.controller;

import com.qfedu.entity.KeCheng;
import com.qfedu.service.KeChengSerivce;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class KeChengController {

    @Autowired
    private KeChengSerivce service;

    @ApiOperation(notes = "课程列表展示",tags = {"健身课程的接口"},value = "健身课程页面的列表展示")
    @PostMapping("showlist.do")
    public ResultVo<KeCheng> showlist(){
        return  service.selectAll();
    }
}
