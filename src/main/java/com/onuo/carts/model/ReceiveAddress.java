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
    private Integer addressId;

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
    private Integer custId;

    /**
     * 获取收件地址id
     *
     * @return address_id - 收件地址id
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * 设置收件地址id
     *
     * @param addressId 收件地址id
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取省份
     *
     * @return address_province - 省份
     */
    public String getAddressProvince() {
        return addressProvince;
    }

    /**
     * 设置省份
     *
     * @param addressProvince 省份
     */
    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    /**
     * 获取城市
     *
     * @return address_city - 城市
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * 设置城市
     *
     * @param addressCity 城市
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * 获取区
     *
     * @return address_area - 区
     */
    public String getAddressArea() {
        return addressArea;
    }

    /**
     * 设置区
     *
     * @param addressArea 区
     */
    public void setAddressArea(String addressArea) {
        this.addressArea = addressArea;
    }

    /**
     * 获取街道
     *
     * @return address_street - 街道
     */
    public String getAddressStreet() {
        return addressStreet;
    }

    /**
     * 设置街道
     *
     * @param addressStreet 街道
     */
    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    /**
     * 获取详细地址
     *
     * @return address_detail - 详细地址
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * 设置详细地址
     *
     * @param addressDetail 详细地址
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    /**
     * 获取邮政编码
     *
     * @return address_post_code - 邮政编码
     */
    public Integer getAddressPostCode() {
        return addressPostCode;
    }

    /**
     * 设置邮政编码
     *
     * @param addressPostCode 邮政编码
     */
    public void setAddressPostCode(Integer addressPostCode) {
        this.addressPostCode = addressPostCode;
    }

    /**
     * 获取收件人姓名
     *
     * @return address_recipient_name - 收件人姓名
     */
    public String getAddressRecipientName() {
        return addressRecipientName;
    }

    /**
     * 设置收件人姓名
     *
     * @param addressRecipientName 收件人姓名
     */
    public void setAddressRecipientName(String addressRecipientName) {
        this.addressRecipientName = addressRecipientName;
    }

    /**
     * 获取收件人电话
     *
     * @return address_recipient_telno - 收件人电话
     */
    public Long getAddressRecipientTelno() {
        return addressRecipientTelno;
    }

    /**
     * 设置收件人电话
     *
     * @param addressRecipientTelno 收件人电话
     */
    public void setAddressRecipientTelno(Long addressRecipientTelno) {
        this.addressRecipientTelno = addressRecipientTelno;
    }

    /**
     * 获取是否设置为默认收件地址
     *
     * @return is_default_address - 是否设置为默认收件地址
     */
    public Integer getIsDefaultAddress() {
        return isDefaultAddress;
    }

    /**
     * 设置是否设置为默认收件地址
     *
     * @param isDefaultAddress 是否设置为默认收件地址
     */
    public void setIsDefaultAddress(Integer isDefaultAddress) {
        this.isDefaultAddress = isDefaultAddress;
    }

    /**
     * 获取用户id
     *
     * @return cust_id - 用户id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 设置用户id
     *
     * @param custId 用户id
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }
}