package com.onuo.goods.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "shoes_detail")
@Data
public class ShoesDetail {
    @Id
    @Column(name = "shoes_detail_id")
    private String shoesDetailId;

    @Column(name = "shoes_id")
    private String shoesId;

    @Column(name = "shoes_color_id")
    private String shoesColorId;

    @Column(name = "shoes_size_id")
    private String shoesSizeId;

    @Column(name = "shoes_inventory")
    private Integer shoesInventory;

    @Column(name = "shoes_sale_count")
    private Integer shoesSaleCount;

    private Integer status;

}