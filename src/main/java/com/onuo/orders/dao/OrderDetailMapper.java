package com.onuo.orders.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.orders.model.OrderDetail;

public interface OrderDetailMapper extends MyMapper<OrderDetail> {

    /**
     @param orderDetail 添加的新订单详情对象
     @return 返回添加新订单详情是否成功,>1表示添加成功，0表示添加失败
     */
    int saveDetails(OrderDetail orderDetail);
}