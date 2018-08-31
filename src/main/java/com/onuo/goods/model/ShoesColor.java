package com.onuo.goods.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "shoes_color")
@Data
public class ShoesColor {
    @Id
    @Column(name = "shoes_color_id")
    private String shoesColorId;

    @Column(name = "shoes_color_name")
    private String shoesColorName;

    @Column(name = "shoes_color_status")
    private Boolean shoesColorStatus;
}