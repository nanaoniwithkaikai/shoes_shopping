package com.onuo.users.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
public class Customer {
    @Id
    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_pwd")
    private String custPwd;

    @Column(name = "cust_age")
    private Integer custAge;

    @Column(name = "cust_phone")
    private Integer custPhone;

    @Column(name = "cust_email")
    private String custEmail;

    @Column(name = "cust_create_time")
    private Date custCreateTime;

    @Column(name = "cust_update_time")
    private Date custUpdateTime;

    @Column(name = "cust_profile")
    private String custProfile;

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

    /**
     * @return cust_name
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return cust_pwd
     */
    public String getCustPwd() {
        return custPwd;
    }

    /**
     * @param custPwd
     */
    public void setCustPwd(String custPwd) {
        this.custPwd = custPwd;
    }

    /**
     * @return cust_age
     */
    public Integer getCustAge() {
        return custAge;
    }

    /**
     * @param custAge
     */
    public void setCustAge(Integer custAge) {
        this.custAge = custAge;
    }

    /**
     * @return cust_phone
     */
    public Integer getCustPhone() {
        return custPhone;
    }

    /**
     * @param custPhone
     */
    public void setCustPhone(Integer custPhone) {
        this.custPhone = custPhone;
    }

    /**
     * @return cust_email
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * @param custEmail
     */
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    /**
     * @return cust_create_time
     */
    public Date getCustCreateTime() {
        return custCreateTime;
    }

    /**
     * @param custCreateTime
     */
    public void setCustCreateTime(Date custCreateTime) {
        this.custCreateTime = custCreateTime;
    }

    /**
     * @return cust_update_time
     */
    public Date getCustUpdateTime() {
        return custUpdateTime;
    }

    /**
     * @param custUpdateTime
     */
    public void setCustUpdateTime(Date custUpdateTime) {
        this.custUpdateTime = custUpdateTime;
    }

    /**
     * @return cust_profile
     */
    public String getCustProfile() {
        return custProfile;
    }

    /**
     * @param custProfile
     */
    public void setCustProfile(String custProfile) {
        this.custProfile = custProfile;
    }
}