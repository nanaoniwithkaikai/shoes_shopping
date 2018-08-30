package com.onuo.goods.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.goods.model.Category;

import java.util.List;

public interface CategoryMapper extends MyMapper<Category> {
    /**
     @return 返回所有鞋子的类别
     */
     List<Category> queryAll();
}