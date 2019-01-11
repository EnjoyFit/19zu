package com.qfedu.controller;

import com.qfedu.entity.YinShi;
import com.qfedu.service.YinShiSerivce;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class YinShiController {

    @Autowired
    private YinShiSerivce service;

    @ApiOperation(notes = "健康饮食列表展示",tags = {"健身饮食的接口"},value = "健身饮食页面的列表展示")
    @PostMapping("show.do")
    public ResultVo<YinShi> show(){
        return  service.selectAll();
    }
}
