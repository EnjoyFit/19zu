package com.qfedu.controller;

import com.qfedu.service.XlykechengService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是第十九组编写的接口文档",value = "接口文档")
@RestController
public class XlykechengController  {
    @Autowired
    private XlykechengService xlykechengService;

    @ApiOperation(notes = "训练营课程的信息",tags = {"训练营课程查询全部的接口"},value = "训练营课程查询")
    @GetMapping("roleall.do")
    @CrossOrigin
    public ResultVo all() {
        return xlykechengService.queryAll();
    }
}
