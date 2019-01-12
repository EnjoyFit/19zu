package com.qfedu.service.impl;

import com.qfedu.dao.KeChengMapper;
import com.qfedu.entity.KeCheng;
import com.qfedu.service.KeChengSerivce;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeChengServiceImpl implements KeChengSerivce {

    @Autowired
    private KeChengMapper mapper;

    @Override
    public ResultVo<KeCheng> selectAll() {
        if (mapper.selectAll()==null){
            return ResultVo.setERROR();
        }else {
            List<KeCheng> list = mapper.selectAll();
            return  ResultVo.setOK(list);
        }

    }
}
