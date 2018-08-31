package com.onuo.carts.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "receive_address")
@Data
public class ReceiveAddress {
    /**
     * 收件地址id
     */
    @Id
    @Column(name = "address_id")
    private String addressId;

    /**
     * 省份
     */
    @Column(name = "address_province")
    private String addressProvince;

    /**
     * 城市
     */
    @Column(name = "address_city")
    private String addressCity;

    /**
     * 区
     */
    @Column(name = "address_area")
    private String addressArea;

    /**
     * 街道
     */
    @Column(name = "address_street")
    private String addressStreet;

    /**
     * 详细地址
     */
    @Column(name = "address_detail")
    private String addressDetail;

    /**
     * 邮政编码
     */
    @Column(name = "address_post_code")
    private Integer addressPostCode;

    /**
     * 收件人姓名
     */
    @Column(name = "address_recipient_name")
    private String addressRecipientName;

    /**
     * 收件人电话
     */
    @Column(name = "address_recipient_telno")
    private Long addressRecipientTelno;

    /**
     * 是否设置为默认收件地址
     */
    @Column(name = "is_default_address")
    private Integer isDefaultAddress;

    /**
     * 用户id
     */
    @Column(name = "cust_id")
    private String custId;

}