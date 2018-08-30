package com.onuo.goods.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
public class Category {
    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_desc")
    private String categoryDesc;

    @Column(name = "category_create_time")
    private Date categoryCreateTime;

    @Column(name = "category_update_time")
    private Date categoryUpdateTime;

    @Column(name = "category_status")
    private Byte categoryStatus;

    /**
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return category_name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return category_desc
     */
    public String getCategoryDesc() {
        return categoryDesc;
    }

    /**
     * @param categoryDesc
     */
    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    /**
     * @return category_create_time
     */
    public Date getCategoryCreateTime() {
        return categoryCreateTime;
    }

    /**
     * @param categoryCreateTime
     */
    public void setCategoryCreateTime(Date categoryCreateTime) {
        this.categoryCreateTime = categoryCreateTime;
    }

    /**
     * @return category_update_time
     */
    public Date getCategoryUpdateTime() {
        return categoryUpdateTime;
    }

    /**
     * @param categoryUpdateTime
     */
    public void setCategoryUpdateTime(Date categoryUpdateTime) {
        this.categoryUpdateTime = categoryUpdateTime;
    }

    /**
     * @return category_status
     */
    public Byte getCategoryStatus() {
        return categoryStatus;
    }

    /**
     * @param categoryStatus
     */
    public void setCategoryStatus(Byte categoryStatus) {
        this.categoryStatus = categoryStatus;
    }
}