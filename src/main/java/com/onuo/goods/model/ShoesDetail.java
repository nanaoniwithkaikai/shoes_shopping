package com.onuo.goods.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "shoes_detail")
@Data
public class ShoesDetail {
    @Id
    @Column(name = "shoes_detail_id")
    private Integer shoesDetailId;

    @Column(name = "shoes_id")
    private Integer shoesId;

    @Column(name = "shoes_color_id")
    private Integer shoesColorId;

    @Column(name = "shoes_size_id")
    private Integer shoesSizeId;

    @Column(name = "shoes_inventory")
    private Integer shoesInventory;

    @Column(name = "shoes_sale_count")
    private Integer shoesSaleCount;

    private Integer status;

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
     * @return shoes_id
     */
    public Integer getShoesId() {
        return shoesId;
    }

    /**
     * @param shoesId
     */
    public void setShoesId(Integer shoesId) {
        this.shoesId = shoesId;
    }

    /**
     * @return shoes_color_id
     */
    public Integer getShoesColorId() {
        return shoesColorId;
    }

    /**
     * @param shoesColorId
     */
    public void setShoesColorId(Integer shoesColorId) {
        this.shoesColorId = shoesColorId;
    }

    /**
     * @return shoes_size_id
     */
    public Integer getShoesSizeId() {
        return shoesSizeId;
    }

    /**
     * @param shoesSizeId
     */
    public void setShoesSizeId(Integer shoesSizeId) {
        this.shoesSizeId = shoesSizeId;
    }

    /**
     * @return shoes_inventory
     */
    public Integer getShoesInventory() {
        return shoesInventory;
    }

    /**
     * @param shoesInventory
     */
    public void setShoesInventory(Integer shoesInventory) {
        this.shoesInventory = shoesInventory;
    }

    /**
     * @return shoes_sale_count
     */
    public Integer getShoesSaleCount() {
        return shoesSaleCount;
    }

    /**
     * @param shoesSaleCount
     */
    public void setShoesSaleCount(Integer shoesSaleCount) {
        this.shoesSaleCount = shoesSaleCount;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}