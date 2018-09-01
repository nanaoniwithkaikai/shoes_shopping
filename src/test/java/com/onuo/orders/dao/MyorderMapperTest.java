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

    /**
     * 1.添加订单
     */
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
        System.out.println("返回值："+rows);
    }

    /**
     * 2.查询用户所有订单
     */
    @Test
    public void queryAll(){
        List<Myorder> myorderList=mapper.queryAll("1001");//（用户id）
        for (Myorder myorder:myorderList){
            System.out.println(myorder);
            System.out.println("-------------------------------------------------");
        }
    }

    /**
     * 3.根据鞋的名字模糊查询指定用户订单
     */
    @Test
    public void queryByShooesName(){
        List<Myorder> myorderList=mapper.queryByShooesName("ni","1001");//（鞋的模糊名，用户id）
        for(Myorder myorder:myorderList){
            System.out.println(myorder);
        }
    }

    /**
     * 4.根据鞋的编号模糊查询指定用户订单
     */
    @Test
    public void queryById(){
        List<Myorder> myorderList=mapper.queryById("0","1001");//(鞋的模糊id,用户id)
        for(Myorder myorder:myorderList){
            System.out.println(myorder);
            System.out.println("123");
        }
    }

    /**
     * 5. 修改订单状态
     */
    @Test
    public void updateStatus(){
        int rows=mapper.updateStatus(1,"18083111477828");//（状态参数，订单id）
        System.out.println("返回值："+rows);
        MybatisUtil.closeSession();
    }
}
