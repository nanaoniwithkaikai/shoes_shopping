package com.onuo.goods.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.goods.model.ShoesImg;

import java.util.List;

public interface ShoesImgMapper extends MyMapper<ShoesImg> {
    /**
     @param shooesId 指定的鞋子ID
     @return 返回指定鞋子的所有图片
     */
     List<ShoesImg> queryAllImgByShooesId(Integer shooesId);
}