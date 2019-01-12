package com.qfedu.service.impl;

import com.qfedu.dao.XlykechengMapper;
import com.qfedu.service.XlykechengService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XlykechengServiceImpl implements XlykechengService {

    @Autowired
    private  XlykechengMapper xlykechengMapper;

    @Override
    public ResultVo queryAll() {
        return ResultVo.setOK(xlykechengMapper.select());
    }
}
