package com.onuo.orders.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "order_detail")
@Data
public class OrderDetail {
    /**
     * 订单id
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * 鞋的详情id
     */
    @Id
    @Column(name = "shoes_detail_id")
    private String shoesDetailId;

    /**
     *鞋的质量
     */
    @Column
    private Integer quality;

    /**
     * 鞋子颜色
     */
    @Column(name = "order_shoes_color")
    private String orderShoesColor;

    /**
     * 鞋子尺码
     */
    @Column(name = "order_shoes_size")
    private String orderShoesSize;

}