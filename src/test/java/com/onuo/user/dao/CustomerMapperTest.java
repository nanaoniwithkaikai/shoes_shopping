package com.onuo.user.dao;

import com.onuo.common.util.CommonMapper;
import com.onuo.common.util.IdGenerator;
import com.onuo.common.util.MybatisUtil;
import com.onuo.users.dao.CustomerMapper;
import com.onuo.users.model.Customer;
import org.junit.Test;

public class CustomerMapperTest {
    CustomerMapper mapper= (CustomerMapper) CommonMapper.getInstance().getMapper(CustomerMapper.class);

    /**
     *  判断手机号是否已经注册过
     *  若该手机号已经注册，则返回已注册的手机号，若没有注册过，则返回null
     */
    @Test
    public void testIsValidTelno() {
        Long l1 = mapper.isValidTelno("18386223128");
        System.out.println(l1);
    }

    /**
     * 判断邮箱是否已经注册过
     * 若该邮箱已经注册，则返回已注册的邮箱，若没有注册过，则返回null.
     */
    @Test
    public void testIsValidEmail() {
        String s1 = mapper.isValidEmail("Yinguigen@aliyun.com");
        System.out.println(s1);
    }

    @Test
    public void testUpdatePwd() {
        Customer customer = new Customer();
        customer.setCustId("18083176086190");
        customer.setCustPwd("ygg123");
        int rows = mapper.updatePwd(customer);
        MybatisUtil.closeSession();
        System.out.println(rows);
    }

    /**
     *  新用户注册
     *
     */
    @Test
    public void testRegist() {
        Customer customer = new Customer();
        customer.setCustId(IdGenerator.getNewUserId());
        customer.setCustName("汪志华");
        customer.setCustAge(22);
        customer.setCustPwd("123456");
        customer.setCustPhone("18960414654");
        customer.setCustEmail("Wangzhihua@aliyun.com");
        customer.setCustCreateTime(null);
        customer.setCustUpdateTime(null);
        customer.setCustProfile(null);
        int rows = mapper.regist(customer);
        MybatisUtil.closeSession();
        System.out.println(rows);
    }

    /**
     * 判断用户登录手机号和密码是否正确
     * 返回登录用户信息，若返回null,表示账户或密码错误
     */
    @Test
    public void testCheckTelnoAndPwd() {
       Customer customer =  mapper.checkTelnoAndPwd("18960414654","123456");
       System.out.println(customer);
    }

    /**
     * 判断用户登录邮箱和密码是否正确
     * 返回登录用户信息，若返回null,表示账户或密码错误
     */
    @Test
    public void testCheckEmailAndPwd() {
        Customer customer = mapper.checkEmailAndPwd("Yinguigen@aliyun.com","ygg123");
        System.out.println(customer);
    }

    /**
     *根据id查看用户详细信息
     */
    @Test
    public void testQueryById() {
        Customer customer = mapper.queryById("18083128956696");
        System.out.println(customer);
    }
}
