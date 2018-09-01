package com.onuo.goods.dao;

import com.onuo.common.util.CommonMapper;
import com.onuo.goods.model.Category;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CategoryMapperTest {
    CategoryMapper mapper= ( CategoryMapper) CommonMapper.getInstance().getMapper( CategoryMapper.class);

    /**
     * 查看所有鞋子的类别
     */
    @Test
    public void testQueryAll() {
        List<Category> list = mapper.queryAll();
        System.out.println(list);
    }
}
