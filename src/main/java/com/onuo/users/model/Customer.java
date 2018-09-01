package com.onuo.users.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
public class Customer {
    @Id
    @Column(name = "cust_id")
    private String custId;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_pwd")
    private String custPwd;

    @Column(name = "cust_age")
    private Integer custAge;

    @Column(name = "cust_phone")
    private String custPhone;

    @Column(name = "cust_email")
    private String custEmail;

    @Column(name = "cust_create_time")
    private Date custCreateTime;

    @Column(name = "cust_update_time")
    private Date custUpdateTime;

    @Column(name = "cust_profile")
    private String custProfile;

    public Customer() {
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPwd() {
        return custPwd;
    }

    public void setCustPwd(String custPwd) {
        this.custPwd = custPwd;
    }

    public Integer getCustAge() {
        return custAge;
    }

    public void setCustAge(Integer custAge) {
        this.custAge = custAge;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public Date getCustCreateTime() {
        return custCreateTime;
    }

    public void setCustCreateTime(Date custCreateTime) {
        this.custCreateTime = custCreateTime;
    }

    public Date getCustUpdateTime() {
        return custUpdateTime;
    }

    public void setCustUpdateTime(Date custUpdateTime) {
        this.custUpdateTime = custUpdateTime;
    }

    public String getCustProfile() {
        return custProfile;
    }

    public void setCustProfile(String custProfile) {
        this.custProfile = custProfile;
    }
}