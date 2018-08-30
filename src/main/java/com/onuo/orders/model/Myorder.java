package com.onuo.orders.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
public class Myorder {
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_number")
    private String orderNumber;

    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "order_time")
    private Date orderTime;

    @Column(name = "order_price")
    private Date orderPrice;

    @Column(name = "order_address_id")
    private Integer orderAddressId;

    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * @return order_id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * @return order_number
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
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

    /**
     * @return order_time
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * @param orderTime
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * @return order_price
     */
    public Date getOrderPrice() {
        return orderPrice;
    }

    /**
     * @param orderPrice
     */
    public void setOrderPrice(Date orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * @return order_address_id
     */
    public Integer getOrderAddressId() {
        return orderAddressId;
    }

    /**
     * @param orderAddressId
     */
    public void setOrderAddressId(Integer orderAddressId) {
        this.orderAddressId = orderAddressId;
    }

    /**
     * @return order_status
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
}