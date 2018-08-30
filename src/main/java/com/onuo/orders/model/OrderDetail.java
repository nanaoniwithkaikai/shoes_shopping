package com.onuo.orders.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "order_detail")
@Data
public class OrderDetail {
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @Id
    @Column(name = "shoes_detail_id")
    private Integer shoesDetailId;

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
     * @return shoes_detail_id
     */
    public Integer getShoesDetailId() {
        return shoesDetailId;
    }

    /**
     * @param shoesDetailId
     */
    public void setShoesDetailId(Integer shoesDetailId) {
        this.shoesDetailId = shoesDetailId;
    }

    /**
     * @return quality
     */
    public Integer getQuality() {
        return quality;
    }

    /**
     * @param quality
     */
    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    /**
     * 获取鞋子颜色
     *
     * @return order_shoes_color - 鞋子颜色
     */
    public String getOrderShoesColor() {
        return orderShoesColor;
    }

    /**
     * 设置鞋子颜色
     *
     * @param orderShoesColor 鞋子颜色
     */
    public void setOrderShoesColor(String orderShoesColor) {
        this.orderShoesColor = orderShoesColor;
    }

    /**
     * 获取鞋子尺码
     *
     * @return order_shoes_size - 鞋子尺码
     */
    public String getOrderShoesSize() {
        return orderShoesSize;
    }

    /**
     * 设置鞋子尺码
     *
     * @param orderShoesSize 鞋子尺码
     */
    public void setOrderShoesSize(String orderShoesSize) {
        this.orderShoesSize = orderShoesSize;
    }
}