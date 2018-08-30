package com.onuo.common.util;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class MybatisUtilTest {
    @Test
    public void testConnect(){
        try {
            Connection connection =  MybatisUtil.getSession().getConfiguration().getEnvironment().getDataSource().getConnection();
            System.out.println(connection);

            Connection connection2 =  MybatisUtil.getSession().getConfiguration().getEnvironment().getDataSource().getConnection();
            System.out.println(connection2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
