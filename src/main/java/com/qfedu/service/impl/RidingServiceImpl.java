package com.qfedu.service.impl;

import com.qfedu.dao.RidingMapper;
import com.qfedu.service.RidingService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RidingServiceImpl implements RidingService {

    @Autowired
    private RidingMapper ridingMapper;
    @Override
    public ResultVo queryAll() {


        return ResultVo.setOK(ridingMapper.select());
    }
}
