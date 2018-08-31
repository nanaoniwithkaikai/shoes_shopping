package com.onuo.goods.dao;

import com.onuo.common.util.CommonMapper;
import org.junit.Test;

public class ShoesMapperTest {
    ShoesMapper mapper= (ShoesMapper) CommonMapper.getInstance().getMapper(ShoesMapper.class);

    /**
     * 测试查询所有鞋子,默认按照鞋的销量降序排序
     */
    @Test
    public void queryAll(){
        System.out.println(mapper.queryAll());
    }

    /**
     * 根据鞋子名称模糊查询相关鞋子
     */
    @Test
    public void queryByName(){
        System.out.println(mapper.queryByName("ni"));
    }

    /**
     * 根据鞋子的男女款式查询鞋子
     */
    @Test
    public void queryByGender(){
        System.out.println(mapper.queryByGender(1));
    }
}
