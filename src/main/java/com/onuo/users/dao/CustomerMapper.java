package com.onuo.users.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.users.model.Customer;

public interface CustomerMapper extends MyMapper<Customer> {
    /**
     @param telno 验证手机号码是否已经注册
     @return 返回是否是有效的注册手机号，true表示没有注册过，false表示已经注册
     */
    Long isValidTelno(String telno);
    /**
     @param email 验证邮箱是否已经注册
     @return 返回是否是有效的注册邮箱，true表示没有注册过，false表示已经注册
     */
    String isValidEmail(String email);
    /**
     @param customer 需要注册的会员
     @return 返回是否注册成功，true表示注册成功，false表示注册失败
     */
     int regist(Customer customer);
    /**
     设置用户密码 ，根据用户ID修改密码
     @param customer 需要设置密码的用户，该对象封装了新密码
     @return 返回修改受影响行数
     */
     int updatePwd(Customer customer);
    /**
     判断用户登录的手机号与密码是否正确
     @param telno 登录手机号（注册时手机号）
     @param password 登录密码
     @return 返回登录用户信息，若返回null,表示账户或密码错误
     */
      Customer checkTelnoAndPwd(String telno, String password);
    /**
     判断用户登录的邮箱与密码是否正确
     @param email 登录邮箱（注册时的邮箱）
     @param password 登录密码
     @return 返回登录用户信息，若返回null,表示账户或密码错误
     */
      Customer checkEmailAndPwd(String email, String password);
    /**
     @param custId 用户ID
     @return 返回用户详细信息
     */
      Customer queryById(String custId);
}