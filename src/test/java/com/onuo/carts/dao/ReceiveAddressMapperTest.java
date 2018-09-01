package com.onuo.carts.dao;


import com.onuo.carts.model.ReceiveAddress;
import com.onuo.common.util.CommonMapper;
import com.onuo.common.util.IdGenerator;
import com.onuo.common.util.MybatisUtil;
import org.junit.Test;


import java.util.List;

public class ReceiveAddressMapperTest {
    ReceiveAddressMapper mapper = (ReceiveAddressMapper) CommonMapper.getInstance().getMapper(ReceiveAddressMapper.class);



    @Test
    public void savetest() {
        ReceiveAddress address = new ReceiveAddress();
        address.setAddressId(IdGenerator.getNewUserId());
        address.setAddressProvince("江苏");
        address.setAddressCity("南京");
        address.setAddressArea("江宁区");
        address.setAddressStreet("步行街");
        address.setAddressDetail("夫子庙");
        address.setAddressPostCode(250);
        address.setAddressRecipientName("隔壁老王");
        address.setAddressRecipientTelno(18860423212L);
        address.setIsDefaultAddress(0);
        address.setCustId("18083176086190");
        int rows=mapper.save(address);
        System.out.println("返回值:"+rows);
        MybatisUtil.closeSession();
    }

    @Test
    public void testupdate() {
        ReceiveAddress address = new ReceiveAddress();
        address.setAddressId("18090169093696");
        address.setAddressProvince("安徽1222");
        address.setAddressCity("六安");
        address.setAddressArea("裕安区");
        address.setAddressStreet("红街");
        address.setAddressDetail("皖西学院");
        address.setAddressPostCode(null);
        address.setAddressRecipientName(null);
        address.setAddressRecipientTelno(18860423212L);
        address.setIsDefaultAddress(null);
        address.setCustId("18083176086190");
        mapper.update(address);
        MybatisUtil.closeSession();
    }

    @Test
    public void testUpdateDefaultAddress(){
        mapper.updateDefaultAddress("18090169093696","18083176086190");
        MybatisUtil.closeSession();

    }

    @Test
    public void testDelete(){
        mapper.delete("18090191745341");
        MybatisUtil.closeSession();

    }

    @Test
    public void testQueryAll() {
        List<ReceiveAddress> list = mapper.queryAll("18083176086190");
        for (ReceiveAddress r : list)
            System.out.println(r);
    }
}

