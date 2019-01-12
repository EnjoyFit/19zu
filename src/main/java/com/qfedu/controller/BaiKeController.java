package com.qfedu.controller;

import com.qfedu.entity.BaiKe;
import com.qfedu.service.BaiKeService;
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
public class BaiKeController {
    @Autowired
    private BaiKeService baiKeService;

    //添加话题
    @ApiOperation(notes = "话题对象的信息",tags = {"话题的接口"},value = "话题添加的接口")
    @PostMapping("addBaike.do")
    @CrossOrigin
    public ResultVo addBaike(@ApiParam(value = "baike对象") BaiKe baiKe) {
        boolean b =baiKeService.insertsBaike(baiKe);
        if(b) {
            return ResultVo.setOK(null);

        }else {
            return ResultVo.setERROR();

        }
    }
    //展示全部话题
    @ApiOperation(notes = "话题对象的信息",tags = {"话题的接口"},value = "话题展示的接口")
    @PostMapping("quarryBaike.do")
    @CrossOrigin
    public PageBeanVo<BaiKe> quarryBaiKe(@ApiParam(value = "分页的信息") int page,int limit) {
        return baiKeService.queryPage(page, limit);

    }

    //修改话题
    @ApiOperation(notes = "话题对象的信息",tags = {"话题的接口"},value = "话题修改的接口")
    @GetMapping("updateBaike.do")
    @CrossOrigin
    public ResultVo upBaike(@ApiParam(value = "id") Integer id) {
        int i = baiKeService.updateBaike(id);
        if (i>0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }

    }

    //删除话题删除
    @ApiOperation(notes = "话题删除的接口",tags = {"话题的接口"},value = "话题删除的接口")
    @PostMapping("delHuati.do")
    @CrossOrigin
    public ResultVo delBaike(@ApiParam(value = "删除对象的id") Integer id) {
        int i = baiKeService.delBaike(id);

        if (i>0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }

}
