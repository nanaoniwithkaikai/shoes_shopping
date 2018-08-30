package com.onuo.users.dao;

import com.onuo.common.mapper.MyMapper;
import com.onuo.users.model.CustLogin;

public interface CustLoginMapper extends MyMapper<CustLogin> {
    /**
     添加登录记录
     @param custLogin 用户登录信息对象
     @return  返回添加受影响的行数
     */
      int save(CustLogin custLogin);
}