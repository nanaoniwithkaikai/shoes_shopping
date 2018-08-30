package com.onuo.carts.dao;


import com.onuo.common.util.CommonMapper;
import org.junit.Test;

public class ReceiveAddressMapperTest{
    ReceiveAddressMapper mapper= (ReceiveAddressMapper) CommonMapper.getInstance().getMapper(ReceiveAddressMapper.class);
    @Test
    public void testQuery(){

        System.out.print(1);
        System.out.println(mapper.queryAll(1));
    }
}
