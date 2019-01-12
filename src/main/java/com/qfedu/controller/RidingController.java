package com.qfedu.controller;

import com.qfedu.service.RidingService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是第十九组编写的接口文档",value = "接口文档")
@RestController
public class RidingController {
    @Autowired
    private RidingService ridingService;
    @ApiOperation(notes = "骑行的信息",tags = {"骑行查询的接口"},value = "骑行课程查询")
    @GetMapping("ridingall.do")
    @CrossOrigin
    public ResultVo all() {
        return ridingService.queryAll();
    }
}
