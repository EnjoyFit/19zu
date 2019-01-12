package com.qfedu.controller;

import com.qfedu.service.JstrainService;
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
public class JstrainController {

    @Autowired
    private JstrainService jstrainService;

    @ApiOperation(notes = "健身训练的信息",tags = {"健身训练查询的接口"},value = "健身训练营课程查询")
    @GetMapping("jstrainall.do")
    @CrossOrigin
    public ResultVo all() {
        return jstrainService.queryAll();
    }
}
