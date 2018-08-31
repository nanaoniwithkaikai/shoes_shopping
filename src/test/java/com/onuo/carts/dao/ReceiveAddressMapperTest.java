package com.onuo.carts.dao;


import com.onuo.common.util.CommonMapper;
import org.junit.Test;

public class ReceiveAddressMapperTest{
    ReceiveAddressMapper mapper= (ReceiveAddressMapper) CommonMapper.getInstance().getMapper(ReceiveAddressMapper.class);
    @Test
    public void testQuery(){

        System.out.print(1);
        System.out.println(mapper.queryAll(1));
        System.out.println("wangyingchangceshi");
        System.out.println("殷桂根帅！！！");
        System.out.println("吴冬前更帅！！！");
        System.out.println("姜明锐最帅!!!!!!!!");


    }
}
