package com.find.search.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Goods {
    private Integer goodsId;
    private String goodsName;
    private String goodsImg;
    private String goodsFeature;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//处理前端接收的
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//处理后端接收的
    private Date goodsDistime;
    private String goodsDisplace;
    private Integer userId;
    private String userName;
    private String userPhone;
    private Integer goodsSuccess;

    private Integer page;
    private Integer pageRow;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsFeature() {
        return goodsFeature;
    }

    public void setGoodsFeature(String goodsFeature) {
        this.goodsFeature = goodsFeature;
    }

    public Date getGoodsDistime() {
        return goodsDistime;
    }

    public void setGoodsDistime(Date goodsDistime) {
        this.goodsDistime = goodsDistime;
    }

    public String getGoodsDisplace() {
        return goodsDisplace;
    }

    public void setGoodsDisplace(String goodsDisplace) {
        this.goodsDisplace = goodsDisplace;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getGoodsSuccess() {
        return goodsSuccess;
    }

    public void setGoodsSuccess(Integer goodsSuccess) {
        this.goodsSuccess = goodsSuccess;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageRow() {
        return pageRow;
    }

    public void setPageRow(Integer pageRow) {
        this.pageRow = pageRow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods)) return false;

        Goods goods = (Goods) o;

        if (getGoodsId() != null ? !getGoodsId().equals(goods.getGoodsId()) : goods.getGoodsId() != null) return false;
        if (getGoodsName() != null ? !getGoodsName().equals(goods.getGoodsName()) : goods.getGoodsName() != null)
            return false;
        if (getGoodsImg() != null ? !getGoodsImg().equals(goods.getGoodsImg()) : goods.getGoodsImg() != null)
            return false;
        if (getGoodsFeature() != null ? !getGoodsFeature().equals(goods.getGoodsFeature()) : goods.getGoodsFeature() != null)
            return false;
        if (getGoodsDistime() != null ? !getGoodsDistime().equals(goods.getGoodsDistime()) : goods.getGoodsDistime() != null)
            return false;
        if (getGoodsDisplace() != null ? !getGoodsDisplace().equals(goods.getGoodsDisplace()) : goods.getGoodsDisplace() != null)
            return false;
        if (getUserId() != null ? !getUserId().equals(goods.getUserId()) : goods.getUserId() != null) return false;
        if (getUserName() != null ? !getUserName().equals(goods.getUserName()) : goods.getUserName() != null)
            return false;
        if (getUserPhone() != null ? !getUserPhone().equals(goods.getUserPhone()) : goods.getUserPhone() != null)
            return false;
        if (getGoodsSuccess() != null ? !getGoodsSuccess().equals(goods.getGoodsSuccess()) : goods.getGoodsSuccess() != null)
            return false;
        if (getPage() != null ? !getPage().equals(goods.getPage()) : goods.getPage() != null) return false;
        return getPageRow() != null ? getPageRow().equals(goods.getPageRow()) : goods.getPageRow() == null;
    }

    @Override
    public int hashCode() {
        int result = getGoodsId() != null ? getGoodsId().hashCode() : 0;
        result = 31 * result + (getGoodsName() != null ? getGoodsName().hashCode() : 0);
        result = 31 * result + (getGoodsImg() != null ? getGoodsImg().hashCode() : 0);
        result = 31 * result + (getGoodsFeature() != null ? getGoodsFeature().hashCode() : 0);
        result = 31 * result + (getGoodsDistime() != null ? getGoodsDistime().hashCode() : 0);
        result = 31 * result + (getGoodsDisplace() != null ? getGoodsDisplace().hashCode() : 0);
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        result = 31 * result + (getUserName() != null ? getUserName().hashCode() : 0);
        result = 31 * result + (getUserPhone() != null ? getUserPhone().hashCode() : 0);
        result = 31 * result + (getGoodsSuccess() != null ? getGoodsSuccess().hashCode() : 0);
        result = 31 * result + (getPage() != null ? getPage().hashCode() : 0);
        result = 31 * result + (getPageRow() != null ? getPageRow().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsFeature='" + goodsFeature + '\'' +
                ", goodsDistime=" + goodsDistime +
                ", goodsDisplace='" + goodsDisplace + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", goodsSuccess=" + goodsSuccess +
                ", page=" + page +
                ", pageRow=" + pageRow +
                '}';
    }
}
