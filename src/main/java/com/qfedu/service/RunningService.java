package com.qfedu.service;

import com.qfedu.vo.ResultVo;

public interface RunningService {
    //查询全部
    ResultVo queryAll();

    //根据名字查询图片
   ResultVo queryimg(String rname);
}
