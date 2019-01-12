package com.qfedu.controller;

import com.qfedu.service.RunningService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是第十九组编写的接口文档",value = "接口文档")
@RestController
public class RunningController {
    @Autowired
    private RunningService runningService;
    @ApiOperation(notes = "跑步训练的信息",tags = {"跑步查询的接口"},value = "跑步查询")
    @GetMapping("runningall.do")
    @CrossOrigin
    public ResultVo all() {
        return runningService.queryAll();
    }

    @ApiOperation(notes = "跑步训练的信息",tags = {"跑步查询的接口"},value = "根据名字查询图片")
    @GetMapping("imgurl.do")
    public  ResultVo querryingurl(@ApiParam(value = "传来是那种类型") String rname) {
        return  runningService.queryimg(rname);

    }
}
