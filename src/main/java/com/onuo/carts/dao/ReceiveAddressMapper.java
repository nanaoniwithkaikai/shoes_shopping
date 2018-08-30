package com.onuo.carts.dao;

import com.onuo.carts.model.ReceiveAddress;
import com.onuo.common.mapper.MyMapper;

import java.util.List;

public interface ReceiveAddressMapper extends MyMapper<ReceiveAddress> {
    /**
     @param newAddress 新增的收件地址对象
     @param custId 当前用户ID
     @return 返回是否添加成功,true表示添加成功，false表示添加失败
     */
    int save(ReceiveAddress newAddress,Integer custId);

    /**
     @param addressId 要删除的收件地址ID
     @param custId 当前用户ID
     @return 返回是否删除成功,true表示删除成功，false表示删除失败
     */
    int delete(Integer addressId,Integer custId);

    /**
     @param address 要修改的收件地址对象
     @param custId 当前用户ID
     @return 返回是否修改成功,true表示修改成功，false表示修改失败
     */
    int update(ReceiveAddress address,Integer custId);
    /**
     @param custId 当前用户ID
     @return 返回当前客户所有的
     */
      List<ReceiveAddress> queryAll(Integer custId);
    /**
     @param addressId 要设置为默认收件地址的地址ID
     @param custId 当前用户ID
     @return 返回是否修改成功,true表示修改成功，false表示修改失败
     */
    int updateDefaultAddress(Integer addressId,Integer custId);
}