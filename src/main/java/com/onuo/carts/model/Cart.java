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

    /**
     * @return cart_id
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * @param cartId
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
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
    public String getQuality() {
        return quality;
    }

    /**
     * @param quality
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * @return add_time
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * @param addTime
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}