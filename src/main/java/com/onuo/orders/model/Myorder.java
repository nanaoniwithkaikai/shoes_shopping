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

}