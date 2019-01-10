package com.qfedu.service;

import com.qfedu.entity.Item;

public interface ItemService {

    int deleteByPrimaryKey(Integer id);

    int insert(Item item);

    int insertSelective(Item item);

    Item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Item item);

    int updateByPrimaryKey(Item item);
}
