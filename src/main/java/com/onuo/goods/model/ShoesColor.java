package com.onuo.goods.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "shoes_color")
@Data
public class ShoesColor {
    @Id
    @Column(name = "shoes_color_id")
    private Integer shoesColorId;

    @Column(name = "shoes_color_name")
    private String shoesColorName;

    @Column(name = "shoes_color_status")
    private Boolean shoesColorStatus;

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
     * @return shoes_color_name
     */
    public String getShoesColorName() {
        return shoesColorName;
    }

    /**
     * @param shoesColorName
     */
    public void setShoesColorName(String shoesColorName) {
        this.shoesColorName = shoesColorName;
    }

    /**
     * @return shoes_color_status
     */
    public Boolean getShoesColorStatus() {
        return shoesColorStatus;
    }

    /**
     * @param shoesColorStatus
     */
    public void setShoesColorStatus(Boolean shoesColorStatus) {
        this.shoesColorStatus = shoesColorStatus;
    }
}