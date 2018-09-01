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
    public void testQuery() {
        System.out.print(1);
        List<ReceiveAddress> list = mapper.queryAll("1");
        for (ReceiveAddress r : list)
            System.out.println(r);
        System.out.println("wangyingchangceshi");
        System.out.println("殷桂根帅！！！");
        System.out.println("吴冬前更帅！！！");
    }

    @Test
    public void savetest() {
        ReceiveAddress address = new ReceiveAddress();
        address.setAddressId(IdGenerator.getNewUserId());
        address.setAddressProvince("小安徽");
        address.setAddressCity("六安");
        address.setAddressStreet("红街");
        address.setAddressDetail("皖西学院");
        address.setAddressPostCode(null);
        address.setAddressRecipientName(null);
        address.setAddressRecipientTelno(18860423212L);
        address.setIsDefaultAddress(null);
        address.setCustId("1001");
        mapper.save(address);
        MybatisUtil.closeSession();
    }

    @Test
    public void testupdate() {
        ReceiveAddress address = new ReceiveAddress();
        address.setAddressProvince("安徽1222");
        address.setAddressCity("六安");
        address.setAddressArea("裕安区");
        address.setAddressStreet("红街");
        address.setAddressDetail("皖西学院");
        address.setAddressPostCode(null);
        address.setAddressRecipientName(null);
        address.setAddressRecipientTelno(18860423212L);
        address.setIsDefaultAddress(null);
        address.setCustId("1001");
        mapper.update(address);
        MybatisUtil.closeSession();
    }
}

