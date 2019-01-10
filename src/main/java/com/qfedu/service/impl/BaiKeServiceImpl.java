package com.qfedu.service.impl;

import com.qfedu.dao.BaiKeMapper;
import com.qfedu.entity.BaiKe;
import com.qfedu.service.BaiKeService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BaiKeServiceImpl implements BaiKeService {

    @Autowired
    private BaiKeMapper baiKeMapper;
    @Override
    public boolean insertsBaike(BaiKe baiKe) {
        return baiKeMapper.insert(baiKe);
    }

    @Override
    public int delBaike(Integer id) {
        return baiKeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateBaike(BaiKe baike) {
        return baiKeMapper.updateByPrimaryKeySelective(baike);
    }

    @Override
    public PageBeanVo<BaiKe> queryPage(int page, int limit) {
        Map<String,Object> map=new HashMap();
        map.put("index",(page-1)*limit);
        map.put("limit",limit);
        return PageBeanVo.setPage(baiKeMapper.selectCount(), baiKeMapper.selectByPage(map));
    }


}
