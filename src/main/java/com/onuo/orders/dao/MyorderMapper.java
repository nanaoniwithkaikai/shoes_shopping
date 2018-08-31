package com.onuo.orders.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.orders.model.Myorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyorderMapper extends MyMapper<Myorder> {
    /**
     @param order 添加的新订单对象
     @return 返回是否添加订单成功,1表示添加成功，0表示添加失败
     */
    int save(Myorder order);


    /**
     @param custId 当前用户的ID
     @return 返回当前账户的所有订单列表
     */
    List<Myorder> queryAll(String custId);


    /**
     @param shooesName 要查询的鞋的名称（模糊查询）
     @param custId 当前用户的ID
     @return 返回当前用户的要查询的订单列表
     */
    List<Myorder> queryByShooesName(@Param("shooesName")String shooesName,@Param("custId")String custId);


    /**
     @param shoesId 要查询的鞋编号（模糊查询）
     @param custId 当前用户的ID
     @return 返回当前用户的要查询指定的订单信息
     */
    List<Myorder> queryById(@Param("shoesId") String shoesId,@Param("custId") String custId);


    /**
     @param orderStatus  修改订单状态
     @param orderId  指定的要修改的订单ID
     @return  返回是否修改成功，true表示修改成功，false表示修改失败
     */
    int updateStatus(Integer orderStatus,String orderId);
}