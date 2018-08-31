package com.onuo.goods.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.goods.model.ShoesSize;

import java.util.List;

public interface ShoesSizeMapper extends MyMapper<ShoesSize> {
    /**
     @param shoesId 指定的鞋子ID
     @return 返回指定鞋子的所有尺码
     */
     List<ShoesSize> queryAllSizeByShooesId(String shoesId);
}