package com.onuo.orders.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.orders.model.Myorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyorderMapper extends MyMapper<Myorder> {
    /**
     * 1. 添加订单
     *@param order 订单对象
     *@return 返回是否添加订单成功,>1表示添加成功，0表示添加失败
     */
    int save(Myorder order);


    /**
     *  2.查询用户所有订单
     *@param custId 用户的ID
     *@return 返回当前用户的所有订单列表
     */
    List<Myorder> queryAll(String custId);


    /**
     * 3.根据鞋的名字模糊查询指定用户订单
     *@param shoesName 要查询的鞋的名称（模糊查询）
     *@param custId 用户的ID
     *@return 返回当前用户要查询的订单列表
     */
    List<Myorder> queryByShooesName(@Param("shooesName")String shoesName,@Param("custId")String custId);


    /**
     * 4. 根据鞋的编号模糊查询指定用户订单
     *@param shoesId 要查询的鞋编号（模糊查询）
     *@param custId 当前用户的ID
     *@return 返回当前用户要查询的订单信息
     */
    List<Myorder> queryById(@Param("shoesId") String shoesId,@Param("custId") String custId);


    /**
     * 5. 修改订单状态
     *@param orderStatus  修改订单状态
     *@param orderId  要修改的订单ID
     *@return  返回是否修改成功，>1表示修改成功，0表示修改失败
     */
    int updateStatus(@Param("orderStatus") Integer orderStatus,@Param("orderId") String orderId);
}