package com.qfedu.controller;

import com.qfedu.service.YjclassService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是第十九组编写的接口文档",value = "接口文档")
@RestController
public class YjclassController {
    @Autowired
    private YjclassService yjclassService;

    @ApiOperation(notes = "瑜伽训练的信息",tags = {"瑜伽训练查询的接口"},value = "瑜伽训练营课程查询")
    @GetMapping("yjclassall.do")
    @CrossOrigin
    public ResultVo all() {
        return yjclassService.queryAll();
    }
}
