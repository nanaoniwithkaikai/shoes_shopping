package com.onuo.carts.dao;

import com.onuo.carts.model.Cart;
import com.onuo.common.util.CommonMapper;
import com.onuo.common.util.MybatisUtil;
import com.onuo.goods.model.ShoesDetail;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import com.onuo.common.util.IdGenerator;

import java.util.Date;

/**
 * @
 */
public class CartMapperTest {
    CartMapper mapper= (CartMapper) CommonMapper.getInstance().getMapper(CartMapper.class);
    @Test
    public void save(){
        Cart cart = new Cart();
        cart.setCartId(IdGenerator.getNewUserId());
        cart.setAddTime(new Date());
        cart.setCustId("1001");
        cart.setShoesDetailId("1001");
        mapper.save(cart);
        MybatisUtil.closeSession();
    }
    @Test
    public void delete(){
        ShoesDetail shoesDetail = new ShoesDetail();
        shoesDetail.setShoesDetailId("1001");
        mapper.delete(shoesDetail,"1001");
        MybatisUtil.closeSession();
    }
    @Test
    public void update(){
        mapper.updateCount("1002","1001","12");
        MybatisUtil.closeSession();
    }
}
