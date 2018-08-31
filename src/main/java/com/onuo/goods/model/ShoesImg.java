package com.onuo.goods.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "shoes_img")
@Data
public class ShoesImg {
    @Id
    @Column(name = "img_id")
    private String imgId;

    @Column(name = "shoes_id")
    private String shoesId;

    @Column(name = "img_path")
    private String imgPath;

    @Column(name = "sort_no")
    private Integer sortNo;

}