package com.onuo.carts.model;
import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
public class Cart {
    @Id
    @Column(name = "cart_id")
    private String cartId;

    @Column(name = "cust_id")
    private String custId;

    @Column(name = "shoes_detail_id")
    private String shoesDetailId;

    private String quality;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "update_time")
    private Date updateTime;
}