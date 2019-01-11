package com.qfedu.service;

import com.qfedu.entity.BaiKe;
import com.qfedu.entity.ShiPu;
import com.qfedu.vo.PageBeanVo;

public interface ShiPuService {

    //新增商品
    public boolean insertsshipu(ShiPu shiPu);
    //删除商品
    public int delshipu(Integer id);
    //修改商品
    public int updateShipu(ShiPu shiPu);

    //商品展示
    PageBeanVo<ShiPu> queryPage(int page, int limit);
}
