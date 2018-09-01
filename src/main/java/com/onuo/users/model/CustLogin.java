package com.onuo.users.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cust_login")
@Data
public class CustLogin {
    /**
     * 登录id
     */
    @Id
    @Column(name = "login_id")
    private String loginId;

    /**
     * 登录用户名（注册的手机号或邮箱）
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 登录密码
     */
    @Column(name = "login_pwd")
    private String loginPwd;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 登录ip
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登录状态（0：已登录，1：已下限）
     */
    @Column(name = "login_status")
    private Integer loginStatus;

    @Column(name = "cust_id")
    private String custId;

}