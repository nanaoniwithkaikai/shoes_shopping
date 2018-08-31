package com.onuo.orders.dao;

import com.onuo.common.util.CommonMapper;
import com.onuo.common.util.IdGenerator;
import com.onuo.common.util.MybatisUtil;
import com.onuo.orders.model.Myorder;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class MyorderMapperTest {
    MyorderMapper mapper= (MyorderMapper) CommonMapper.getInstance().getMapper(MyorderMapper.class);
    @Test
    public void save(){
        Myorder myorder=new Myorder();
        myorder.setOrderId(IdGenerator.getNewUserId());
        myorder.setOrderNumber("1");
        myorder.setCustId("1001");
        myorder.setOrderTime(new Date());
        myorder.setOrderPrice(99f);
        myorder.setOrderAddressId("2");
        myorder.setOrderStatus(0);
        int rows=mapper.save(myorder);
        MybatisUtil.closeSession();
        System.out.println(rows);
    }
    @Test
    public void queryAll(){
        List<Myorder> myorderList=mapper.queryAll("1001");//（用户id）
        for (Myorder myorder:myorderList){
            System.out.println(myorder);
        }
    }
    @Test
    public void updateStatus(){
        mapper.updateStatus(1,"1");//（状态参数，订单id）
        MybatisUtil.closeSession();
    }
    @Test
    public void queryByShooesName(){
        List<Myorder> myorderList=mapper.queryByShooesName("ni","1001");//（鞋的模糊名，用户id）
        for(Myorder myorder:myorderList){
            System.out.println(myorder);
        }
    }
    @Test
    public void queryById(){
        List<Myorder> myorderList=mapper.queryById("001","1001");//(鞋的模糊id,用户id)
        for(Myorder myorder:myorderList){
            System.out.println(myorder);
        }
    }
}
