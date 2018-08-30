package com.onuo.carts.model;
import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
public class Cart {
    @Id
    @Column(name = "cart_id")
    private Integer cartId;

    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "shoes_detail_id")
    private Integer shoesDetailId;

    private String quality;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "update_time")
    private Date updateTime;
}