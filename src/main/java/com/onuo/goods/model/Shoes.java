package com.onuo.goods.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
public class Shoes {
    /**
     * 鞋ID
     */
    @Id
    @Column(name = "shoes_id")
    private String shoesId;

    /**
     * 鞋款号
     */
    @Column(name = "shoes_number")
    private String shoesNumber;

    /**
     * 鞋名称
     */
    @Column(name = "shoes_name")
    private String shoesName;

    /**
     * 吊牌价
     */
    @Column(name = "shoes_price_sale")
    private Float shoesPriceSale;

    /**
     * 折扣
     */
    @Column(name = "shoes_discount")
    private Float shoesDiscount;

    /**
     * 鞋描述
     */
    @Column(name = "shoes_desc")
    private String shoesDesc;

    /**
     * 上架时间
     */
    @Column(name = "shoes_onsale_time")
    private Date shoesOnsaleTime;

    /**
     * 下架时间
     */
    @Column(name = "shoes_offsale_time")
    private Date shoesOffsaleTime;

    /**
     * 鞋销量
     */
    @Column(name = "shoes_sale_count")
    private Integer shoesSaleCount;

    /**
     * 适用性别（0：男性，1：女性，2：通用）
     */
    @Column(name = "shoes_gender")
    private Byte shoesGender;

    /**
     * 鞋状态（0：在售，1：下架）
     */
    @Column(name = "shoes_status")
    private Byte shoesStatus;

    /**
     * 鞋类别ID
     */
    @Column(name = "category_id")
    private String categoryId;

}