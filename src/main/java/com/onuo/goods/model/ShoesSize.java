package com.onuo.goods.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "shoes_size")
@Data
public class ShoesSize {
    @Id
    @Column(name = "shoes_size_id")
    private Integer shoesSizeId;

    @Column(name = "shoes_size")
    private Float shoesSize;

    @Column(name = "shoes_state")
    private Boolean shoesState;

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
     * @return shoes_size
     */
    public Float getShoesSize() {
        return shoesSize;
    }

    /**
     * @param shoesSize
     */
    public void setShoesSize(Float shoesSize) {
        this.shoesSize = shoesSize;
    }

    /**
     * @return shoes_state
     */
    public Boolean getShoesState() {
        return shoesState;
    }

    /**
     * @param shoesState
     */
    public void setShoesState(Boolean shoesState) {
        this.shoesState = shoesState;
    }
}