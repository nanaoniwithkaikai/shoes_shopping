package com.onuo.carts.dao;

import com.onuo.carts.model.Cart;
import com.onuo.common.mapper.MyMapper;
import com.onuo.goods.model.Shoes;
import com.onuo.goods.model.ShoesDetail;
import org.apache.ibatis.annotations.Param;

public interface CartMapper extends MyMapper<Cart> {
    /**
     @param cart 要添加至购物车中的鞋对象
     @return 返回是否添加成功,true表示添加成功，false表示添加失败
     */
      int save( Cart cart);
    /**
     @param shoesDetail 要从购物车中删除的鞋对象
     @param custId 当前用户ID
     @return 返回是否删除成功,true表示删除成功，false表示删除失败
     */
    int delete(@Param("shoesDetail") ShoesDetail shoesDetail,@Param("custId") String custId);
    /**
     @param shoes_detail_id 要修改的购物车中鞋ID
     @param custId 当前用户ID
     @param count 购物车中该鞋子的数量
     @return 返回是否删除成功,true表示删除成功，false表示删除失败
     */
    int updateCount(@Param("shoes_detail_id") String shoes_detail_id,@Param("custId") String custId, @Param("count") String count);

}