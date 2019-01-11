package com.qfedu.controller;

import com.qfedu.entity.BaiKe;
import com.qfedu.entity.ShiPu;
import com.qfedu.service.ShiPuService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShiPuController {
    @Autowired
    private ShiPuService shiPuService;

    //添加食品
    @PostMapping("addShiPu.do")
    @CrossOrigin
    public ResultVo addShiPu(@ApiParam(value = "baike对象") ShiPu shiPu) {
        boolean b =shiPuService.insertsshipu(shiPu);
        if(b) {
            return ResultVo.setOK(null);

        }else {
            return ResultVo.setERROR();

        }
    }
    //展示全部商品
    @PostMapping("quarryShiPu.do")
    @CrossOrigin
    public PageBeanVo<ShiPu> quarryShiPu(int page, int limit) {
        return shiPuService.queryPage(page,limit);

    }

    //修改商品
    @GetMapping("updateShiPu.do")
    @CrossOrigin
    public ResultVo upShiPu(ShiPu ShiPu) {
        int i = shiPuService.updateShipu(ShiPu);
        if (i>0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }

    }

    //删除商品
    @PostMapping("delGoods.do")
    @CrossOrigin
    public ResultVo delShiPu(Integer id) {
        int i = shiPuService.delshipu(id);

        if (i>0) {
            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }
}
