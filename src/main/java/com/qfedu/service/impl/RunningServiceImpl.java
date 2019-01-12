package com.qfedu.service.impl;

import com.qfedu.dao.RunningMapper;
import com.qfedu.service.RunningService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RunningServiceImpl implements RunningService {
    @Autowired
    private RunningMapper runningMapper;


    @Override
    public ResultVo queryAll() {
        return ResultVo.setOK(runningMapper.select());
    }

    @Override
    public ResultVo queryimg(String rname) {
        return ResultVo.setOK(runningMapper.selectByRname(rname));
    }
}
