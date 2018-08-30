package com.onuo.users.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.users.model.CustLogin;

public interface CustLoginMapper extends MyMapper<CustLogin> {
    /**
     @param email 登录邮箱
     @param loginPwd 登录密码
     @return 返回是否登录成功，0 表示登录成功，1 表示登录失败 ，2 表示账户失效
     */
      int loginByEmail(String email,String loginPwd );

    /**
     @param telno 用户注册手机号
     @param loginPwd 登录密码
     @return 返回是否登录成功，0 表示登录成功，1 表示登录失败 ，2 表示账户失效
     */
      int loginByTelno(Long telno,String loginPwd );
    /**
     @param oldPwd 旧密码
     @param newPwd 新密码
     @param custId 当前用户ID
     @return 返回是否设置成功，0 表示重置成功，1 表示重置失败
     */
      int resetLoginPwd(String oldPwd,String newPwd, Integer custId);
}