package com.onuo.users.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.users.model.Customer;

public interface CustomerMapper extends MyMapper<Customer> {
    /**
     @param telno 验证手机号码是否已经注册
     @return 返回是否是有效的注册手机号，true表示没有注册过，false表示已经注册
     */
    boolean isValidTelno(Long telno);
    /**
     @param email 验证邮箱是否已经注册
     @return 返回是否是有效的注册邮箱，true表示没有注册过，false表示已经注册
     */
    boolean isValidEmail(String email);
    /**
     @param customer 需要注册的会员
     @return 返回是否注册成功，true表示注册成功，false表示注册失败
     */
     boolean regist(Customer customer );
    /**
     @param custId 用户ID
     @return 返回用户详细信息
     */
      Customer queryById(Integer custId);
}