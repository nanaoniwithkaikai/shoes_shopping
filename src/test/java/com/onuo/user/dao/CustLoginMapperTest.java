package com.onuo.user.dao;

import com.onuo.common.util.CommonMapper;
import com.onuo.common.util.IdGenerator;
import com.onuo.common.util.MybatisUtil;
import com.onuo.users.dao.CustLoginMapper;
import com.onuo.users.model.CustLogin;
import org.junit.Test;

import java.util.Date;

public class CustLoginMapperTest {
    CustLoginMapper mapper= (CustLoginMapper) CommonMapper.getInstance().getMapper(CustLoginMapper.class);
    @Test
    public void testSave() {
        CustLogin custLogin = new CustLogin();
        custLogin.setLoginId(IdGenerator.getNewUserId());
        custLogin.setLoginName("小可爱");
        custLogin.setLoginPwd("123456");
        custLogin.setLoginIp("192.168.1.2");
        custLogin.setLoginTime(new Date());
        custLogin.setLoginStatus(0);
        custLogin.setCustId("18083176086190");
        int rows = mapper.save(custLogin);
        MybatisUtil.closeSession();
        System.out.println(rows);
    }
}
