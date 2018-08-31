package com.onuo.orders.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
public class Myorder {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_number")
    private String orderNumber;

    @Column(name = "cust_id")
    private String custId;

    @Column(name = "order_time")
    private Date orderTime;

    @Column(name = "order_price")
    private Float orderPrice;

    @Column(name = "order_address_id")
    private String orderAddressId;

    @Column(name = "order_status")
    private Integer orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderAddressId() {
        return orderAddressId;
    }

    public void setOrderAddressId(String orderAddressId) {
        this.orderAddressId = orderAddressId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
}