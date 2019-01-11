package com.qfedu.service.impl;

import com.qfedu.dao.ShiPuMapper;
import com.qfedu.entity.ShiPu;
import com.qfedu.service.ShiPuService;
import com.qfedu.vo.PageBeanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ShiPuServiceImpl implements ShiPuService {

    @Autowired
    private ShiPuMapper shiPuMapper;

    @Override
    public boolean insertsshipu(ShiPu shiPu) {
        return shiPuMapper.insert(shiPu);
    }

    @Override
    public int delshipu(Integer id) {
        return shiPuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateShipu(ShiPu shiPu) {
        return shiPuMapper.updateByPrimaryKeySelective(shiPu);
    }

    @Override
    public PageBeanVo<ShiPu> queryPage(int page, int limit) {
        Map<String,Object> map=new HashMap();
        map.put("index",(page-1)*limit);
        map.put("limit",limit);
        return PageBeanVo.setPage(shiPuMapper.selectCount(),shiPuMapper.selectByPage(map));
    }
}
