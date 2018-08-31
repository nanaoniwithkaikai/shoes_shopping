package com.onuo.goods.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
public class Category {
    @Id
    @Column(name = "category_id")
    private String categoryId;

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

}