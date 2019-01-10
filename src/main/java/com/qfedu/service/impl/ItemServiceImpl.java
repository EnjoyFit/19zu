package com.qfedu.service.impl;

import com.qfedu.dao.ItemMapper;
import com.qfedu.entity.Item;
import com.qfedu.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Item item) {
        return mapper.insert(item);
    }

    @Override
    public int insertSelective(Item item) {
        return mapper.insertSelective(item);
    }

    @Override
    public Item selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Item item) {
        return mapper.updateByPrimaryKeySelective(item);
    }

    @Override
    public int updateByPrimaryKey(Item item) {
        return mapper.updateByPrimaryKey(item);
    }
}
