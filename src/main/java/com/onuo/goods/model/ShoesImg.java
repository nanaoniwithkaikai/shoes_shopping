package com.onuo.goods.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "shoes_img")
@Data
public class ShoesImg {
    @Id
    @Column(name = "img_id")
    private Integer imgId;

    @Column(name = "shoes_id")
    private Integer shoesId;

    @Column(name = "img_path")
    private String imgPath;

    @Column(name = "sort_no")
    private Integer sortNo;

    /**
     * @return img_id
     */
    public Integer getImgId() {
        return imgId;
    }

    /**
     * @param imgId
     */
    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    /**
     * @return shoes_id
     */
    public Integer getShoesId() {
        return shoesId;
    }

    /**
     * @param shoesId
     */
    public void setShoesId(Integer shoesId) {
        this.shoesId = shoesId;
    }

    /**
     * @return img_path
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * @param imgPath
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    /**
     * @return sort_no
     */
    public Integer getSortNo() {
        return sortNo;
    }

    /**
     * @param sortNo
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }
}