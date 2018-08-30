package com.onuo.goods.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.goods.model.Shoes;

import java.util.List;

public interface ShoesMapper extends MyMapper<Shoes> {
    /**
     @return 返回所有鞋子,默认按照鞋的销量降序排序
     */
      List<Shoes> queryAll();
    /**
     @param shooesName 指定查询的鞋子名称
     @return 返回鞋子名称中包含指定字符串的鞋子列表
     */
      List<Shoes> queryByName(String shooesName);
    /**
     @param gender 指定查询的鞋子适用的性别，0 表示男性，1 表示女性
     @return 返回指定性别的鞋子对象列表
     */
      List<Shoes> queryByGender(Integer gender);
    /**
     @param size 指定查询的鞋子码数
     @return 返回指定码数的鞋子对象列表
     */
      List<Shoes> queryBySize(Float size);
    /**
     @param minPrice 指定查询的鞋子的最小价格，若最小价格为null,则只按最大价格查询
     @param maxPrice 指定查询的鞋子的最大价格，若大小价格为null,则只按最小价格查询
     @return 返回指定价格范围内的鞋子对象列表
     */
      List<Shoes> queryByPrice(Float minPrice,Float maxPrice);
    /**
     @param categoryId 指定的鞋子类别ID
     @return 返回指定类别中的所有鞋子对象列表
     */
    public  List<Shoes> queryByCategory(Integer categoryId);
}