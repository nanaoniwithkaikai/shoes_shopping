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

}