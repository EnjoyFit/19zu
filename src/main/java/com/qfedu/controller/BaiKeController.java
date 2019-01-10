package com.qfedu.controller;

import com.qfedu.entity.BaiKe;
import com.qfedu.service.BaiKeService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaiKeController {
    @Autowired
    private BaiKeService baiKeService;

    //添加百科
    @PostMapping("addBaike.do")
    @CrossOrigin
    public ResultVo addBaike(BaiKe baiKe) {
        boolean b =baiKeService.insertsBaike(baiKe);
        if(b) {
            return ResultVo.setOK(null);

        }else {
            return ResultVo.setERROR();

        }
    }
    //展示全部百科
    @PostMapping("quarryBaike.do")
    @CrossOrigin
    public PageBeanVo<BaiKe> quarryBaiKe(int page,int limit) {
        return baiKeService.queryPage(page, limit);

    }

    //修改百科
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

    //删除百科
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
