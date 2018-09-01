package com.onuo.orders.dao;

import com.onuo.common.util.CommonMapper;
import com.onuo.common.util.MybatisUtil;
import com.onuo.orders.model.OrderDetail;
import org.junit.Test;

public class OrderDetailMapperTest {
    OrderDetailMapper mapper= (OrderDetailMapper) CommonMapper.getInstance().getMapper(OrderDetailMapper.class);

    /**
     * 1.添加详情订单
     */
    @Test
    public void saveDetails(){
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setOrderId("18083150347418");//主键--关联订单id
        orderDetail.setShoesDetailId("1001");//外键--关联鞋id
        int rows=mapper.saveDetails(orderDetail);
        MybatisUtil.closeSession();//提交并关闭
        System.out.println("返回值："+rows);
    }
}
