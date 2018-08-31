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

}