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
    private Integer shoesId;

    /**
     * 鞋款号
     */
    @Column(name = "shoes_number")
    private Integer shoesNumber;

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
    private Integer categoryId;

    /**
     * 获取鞋ID
     *
     * @return shoes_id - 鞋ID
     */
    public Integer getShoesId() {
        return shoesId;
    }

    /**
     * 设置鞋ID
     *
     * @param shoesId 鞋ID
     */
    public void setShoesId(Integer shoesId) {
        this.shoesId = shoesId;
    }

    /**
     * 获取鞋款号
     *
     * @return shoes_number - 鞋款号
     */
    public Integer getShoesNumber() {
        return shoesNumber;
    }

    /**
     * 设置鞋款号
     *
     * @param shoesNumber 鞋款号
     */
    public void setShoesNumber(Integer shoesNumber) {
        this.shoesNumber = shoesNumber;
    }

    /**
     * 获取鞋名称
     *
     * @return shoes_name - 鞋名称
     */
    public String getShoesName() {
        return shoesName;
    }

    /**
     * 设置鞋名称
     *
     * @param shoesName 鞋名称
     */
    public void setShoesName(String shoesName) {
        this.shoesName = shoesName;
    }

    /**
     * 获取吊牌价
     *
     * @return shoes_price_sale - 吊牌价
     */
    public Float getShoesPriceSale() {
        return shoesPriceSale;
    }

    /**
     * 设置吊牌价
     *
     * @param shoesPriceSale 吊牌价
     */
    public void setShoesPriceSale(Float shoesPriceSale) {
        this.shoesPriceSale = shoesPriceSale;
    }

    /**
     * 获取折扣
     *
     * @return shoes_discount - 折扣
     */
    public Float getShoesDiscount() {
        return shoesDiscount;
    }

    /**
     * 设置折扣
     *
     * @param shoesDiscount 折扣
     */
    public void setShoesDiscount(Float shoesDiscount) {
        this.shoesDiscount = shoesDiscount;
    }

    /**
     * 获取鞋描述
     *
     * @return shoes_desc - 鞋描述
     */
    public String getShoesDesc() {
        return shoesDesc;
    }

    /**
     * 设置鞋描述
     *
     * @param shoesDesc 鞋描述
     */
    public void setShoesDesc(String shoesDesc) {
        this.shoesDesc = shoesDesc;
    }

    /**
     * 获取上架时间
     *
     * @return shoes_onsale_time - 上架时间
     */
    public Date getShoesOnsaleTime() {
        return shoesOnsaleTime;
    }

    /**
     * 设置上架时间
     *
     * @param shoesOnsaleTime 上架时间
     */
    public void setShoesOnsaleTime(Date shoesOnsaleTime) {
        this.shoesOnsaleTime = shoesOnsaleTime;
    }

    /**
     * 获取下架时间
     *
     * @return shoes_offsale_time - 下架时间
     */
    public Date getShoesOffsaleTime() {
        return shoesOffsaleTime;
    }

    /**
     * 设置下架时间
     *
     * @param shoesOffsaleTime 下架时间
     */
    public void setShoesOffsaleTime(Date shoesOffsaleTime) {
        this.shoesOffsaleTime = shoesOffsaleTime;
    }

    /**
     * 获取鞋销量
     *
     * @return shoes_sale_count - 鞋销量
     */
    public Integer getShoesSaleCount() {
        return shoesSaleCount;
    }

    /**
     * 设置鞋销量
     *
     * @param shoesSaleCount 鞋销量
     */
    public void setShoesSaleCount(Integer shoesSaleCount) {
        this.shoesSaleCount = shoesSaleCount;
    }

    /**
     * 获取适用性别（0：男性，1：女性，2：通用）
     *
     * @return shoes_gender - 适用性别（0：男性，1：女性，2：通用）
     */
    public Byte getShoesGender() {
        return shoesGender;
    }

    /**
     * 设置适用性别（0：男性，1：女性，2：通用）
     *
     * @param shoesGender 适用性别（0：男性，1：女性，2：通用）
     */
    public void setShoesGender(Byte shoesGender) {
        this.shoesGender = shoesGender;
    }

    /**
     * 获取鞋状态（0：在售，1：下架）
     *
     * @return shoes_status - 鞋状态（0：在售，1：下架）
     */
    public Byte getShoesStatus() {
        return shoesStatus;
    }

    /**
     * 设置鞋状态（0：在售，1：下架）
     *
     * @param shoesStatus 鞋状态（0：在售，1：下架）
     */
    public void setShoesStatus(Byte shoesStatus) {
        this.shoesStatus = shoesStatus;
    }

    /**
     * 获取鞋类别ID
     *
     * @return category_id - 鞋类别ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置鞋类别ID
     *
     * @param categoryId 鞋类别ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}