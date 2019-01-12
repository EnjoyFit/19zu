package com.qfedu.service.impl;

import com.qfedu.dao.JstrainMapper;
import com.qfedu.service.JstrainService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JstrainServiceImpl implements JstrainService {
    @Autowired
    private JstrainMapper jstrainMapper;

    @Override
    public ResultVo queryAll() {
        return ResultVo.setOK(jstrainMapper.select());
    }
}
