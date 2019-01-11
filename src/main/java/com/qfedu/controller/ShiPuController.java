package com.qfedu.controller;

import com.qfedu.entity.BaiKe;
import com.qfedu.entity.ShiPu;
import com.qfedu.service.ShiPuService;
import com.qfedu.vo.PageBeanVo;
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
public class ShiPuController {
    @Autowired
    private ShiPuService shiPuService;

    //添加食品
    @ApiOperation(notes = "食品的信息",tags = {"食品的接口"},value = "食品添加")
    @PostMapping("addShiPu.do")
    @CrossOrigin
    public ResultVo addShiPu(@ApiParam(value = "食品") ShiPu shiPu) {
        boolean b =shiPuService.insertsshipu(shiPu);
        if(b) {
            return ResultVo.setOK(null);

        }else {
            return ResultVo.setERROR();

        }
    }
    //展示全部商品
    @ApiOperation(notes = "食品的信息",tags = {"食品的接口"},value = "食品展示")
    @PostMapping("quarryShiPu.do")
    @CrossOrigin
    public PageBeanVo<ShiPu> quarryShiPu(@ApiParam(value = "页码") int page, int limit) {
        return shiPuService.queryPage(page,limit);

    }

    //修改商品
    @ApiOperation(notes = "食品的信息",tags = {"食品的接口"},value = "食品修改")
    @GetMapping("updateShiPu.do")
    @CrossOrigin
    public ResultVo upShiPu(@ApiParam(value = "食品") ShiPu ShiPu) {
        int i = shiPuService.updateShipu(ShiPu);
        if (i>0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }

    }

    //删除商品
    @ApiOperation(notes = "食品的信息",tags = {"食品的接口"},value = "食品删除")
    @PostMapping("delShipin.do")
    @CrossOrigin
    public ResultVo delShiPu(@ApiParam(value = "id") Integer id) {
        int i = shiPuService.delshipu(id);

        if (i>0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }
}
