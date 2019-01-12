package com.qfedu.service.impl;


import com.qfedu.dao.YinShiMapper;

import com.qfedu.entity.YinShi;
import com.qfedu.service.YinShiSerivce;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YinShiServiceImpl implements YinShiSerivce {

    @Autowired
    private YinShiMapper mapper;

    @Override
    public ResultVo<YinShi> selectAll() {
        if (mapper.selectAll()==null){
            return ResultVo.setERROR();
        }else {
            List<YinShi> list = mapper.selectAll();
            return  ResultVo.setOK(list);
        }

    }
}
