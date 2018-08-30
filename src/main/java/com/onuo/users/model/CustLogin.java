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
    private Integer loginId;

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
    private Integer custId;

    /**
     * 获取登录id
     *
     * @return login_id - 登录id
     */
    public Integer getLoginId() {
        return loginId;
    }

    /**
     * 设置登录id
     *
     * @param loginId 登录id
     */
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    /**
     * 获取登录用户名（注册的手机号或邮箱）
     *
     * @return login_name - 登录用户名（注册的手机号或邮箱）
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录用户名（注册的手机号或邮箱）
     *
     * @param loginName 登录用户名（注册的手机号或邮箱）
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取登录密码
     *
     * @return login_pwd - 登录密码
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * 设置登录密码
     *
     * @param loginPwd 登录密码
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    /**
     * 获取登录时间
     *
     * @return login_time - 登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取登录ip
     *
     * @return login_ip - 登录ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登录ip
     *
     * @param loginIp 登录ip
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取登录状态（0：已登录，1：已下限）
     *
     * @return login_status - 登录状态（0：已登录，1：已下限）
     */
    public Integer getLoginStatus() {
        return loginStatus;
    }

    /**
     * 设置登录状态（0：已登录，1：已下限）
     *
     * @param loginStatus 登录状态（0：已登录，1：已下限）
     */
    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    /**
     * @return cust_id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * @param custId
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }
}