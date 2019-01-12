package com.qfedu.service.impl;

import com.qfedu.dao.YjclassMapper;
import com.qfedu.service.YjclassService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YjclassServiceImpl implements YjclassService {
    @Autowired
    private YjclassMapper yjclassMapper;

    @Override
    public ResultVo queryAll() {
        return ResultVo.setOK(yjclassMapper.select());
    }
}
