package com.qfedu.service;

import com.qfedu.entity.BaiKe;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResponseVo;

public interface BaiKeService {

    //新增商品
    public boolean insertsBaike(BaiKe baike);
    //删除商品
    public int delBaike(Integer id);
    //修改商品
    public int updateBaike(BaiKe baiKee);

    //商品展示
    PageBeanVo<BaiKe> queryPage(int page, int limit);

}
