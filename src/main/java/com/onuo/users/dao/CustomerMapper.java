package com.onuo.users.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.users.model.Customer;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper extends MyMapper<Customer> {
    /**
     * 验证手机号码是否已经注册
     @param telno 手机号码
     @return  若该手机号已经注册，则返回已注册的手机号，若没有注册过，则返回null
     */
    Long isValidTelno(String telno);

    /**
     * 验证邮箱是否已经注册
     @param email 邮箱
     @return 若该邮箱已经注册，则返回已注册的邮箱，若没有注册过，则返回null
     */
    String isValidEmail(String email);

    /**
     *  新用户注册
     @param customer 需要注册的用户
     @return  返回添加受影响行数
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
      Customer checkTelnoAndPwd(@Param("custPhone") String telno, @Param("custPwd") String password);

    /**
     判断用户登录的邮箱与密码是否正确
     @param email 登录邮箱（注册时的邮箱）
     @param password 登录密码
     @return 返回登录用户信息，若返回null,表示账户或密码错误
     */
      Customer checkEmailAndPwd(@Param("custEmail") String email, @Param("custPwd") String password);

    /**
     @param custId 用户ID
     @return 返回用户详细信息
     */
      Customer queryById(String custId);
}