package com.onuo.goods.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.goods.model.ShoesColor;

import java.util.List;

public interface ShoesColorMapper extends MyMapper<ShoesColor> {
    /**
     @param shoesId 指定的鞋子ID
     @return 返回指定鞋子的所有颜色
     */
     List<ShoesColor> queryAllColorByShooesId(String shoesId);
}