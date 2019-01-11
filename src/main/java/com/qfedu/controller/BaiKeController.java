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

@RestController
public class BaiKeController {
    @Autowired
    private BaiKeService baiKeService;

    //添加话题
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
    @PostMapping("quarryBaike.do")
    @CrossOrigin
    public PageBeanVo<BaiKe> quarryBaiKe(int page,int limit) {
        return baiKeService.queryPage(page, limit);

    }

    //修改话题
    @GetMapping("updateBaike.do")
    @CrossOrigin
    public ResultVo upBaike(BaiKe baiKe) {
        int i = baiKeService.updateBaike(baiKe);
        if (i>0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }

    }

    //删除话题
    @PostMapping("delGoods.do")
    @CrossOrigin
    public ResultVo delBaike(Integer id) {
        int i = baiKeService.delBaike(id);

        if (i>0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }

}
