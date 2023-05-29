package com.find.search.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Humanity{
    private Integer humanityId;
    private String humanityName;
    private String humanitySex;
    private Integer humanityAge;

    @DateTimeFormat(pattern = "yyyy-MM-dd")//处理前端接收的
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")//处理后端接收的
    private Date humanityBirthday;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//处理前端接收的
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")//处理后端接收的
    private Date humanityDistime;
    private String humanityDisplace;
    private String humanityImg;
    private String humanityFeature;
    private Integer userId;
    private String userName;
    private String userPhone;
    private String relationship;
    private String humanitySuccess;  //将Integer改为String

    public Integer getHumanityId() {
        return humanityId;
    }

    public void setHumanityId(Integer humanityId) {
        this.humanityId = humanityId;
    }

    public String getHumanityName() {
        return humanityName;
    }

    public void setHumanityName(String humanityName) {
        this.humanityName = humanityName;
    }

    public String getHumanitySex() {
        return humanitySex;
    }

    public void setHumanitySex(String humanitySex) {
        this.humanitySex = humanitySex;
    }

    public Integer getHumanityAge() {
        return humanityAge;
    }

    public void setHumanityAge(Integer humanityAge) {
        this.humanityAge = humanityAge;
    }

    public Date getHumanityBirthday() {
        return humanityBirthday;
    }

    public void setHumanityBirthday(Date humanityBirthday) {
        this.humanityBirthday = humanityBirthday;
    }

    public Date getHumanityDistime() {
        return humanityDistime;
    }

    public void setHumanityDistime(Date humanityDistime) {
        this.humanityDistime = humanityDistime;
    }

    public String getHumanityDisplace() {
        return humanityDisplace;
    }

    public void setHumanityDisplace(String humanityDisplace) {
        this.humanityDisplace = humanityDisplace;
    }

    public String getHumanityImg() {
        return humanityImg;
    }

    public void setHumanityImg(String humanityImg) {
        this.humanityImg = humanityImg;
    }

    public String getHumanityFeature() {
        return humanityFeature;
    }

    public void setHumanityFeature(String humanityFeature) {
        this.humanityFeature = humanityFeature;
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

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getHumanitySuccess() {
        return humanitySuccess;
    }

    public void setHumanitySuccess(String humanitySuccess) {
        this.humanitySuccess = humanitySuccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Humanity)) return false;

        Humanity humanity = (Humanity) o;

        if (getHumanityId() != null ? !getHumanityId().equals(humanity.getHumanityId()) : humanity.getHumanityId() != null)
            return false;
        if (getHumanityName() != null ? !getHumanityName().equals(humanity.getHumanityName()) : humanity.getHumanityName() != null)
            return false;
        if (getHumanitySex() != null ? !getHumanitySex().equals(humanity.getHumanitySex()) : humanity.getHumanitySex() != null)
            return false;
        if (getHumanityAge() != null ? !getHumanityAge().equals(humanity.getHumanityAge()) : humanity.getHumanityAge() != null)
            return false;
        if (getHumanityBirthday() != null ? !getHumanityBirthday().equals(humanity.getHumanityBirthday()) : humanity.getHumanityBirthday() != null)
            return false;
        if (getHumanityDistime() != null ? !getHumanityDistime().equals(humanity.getHumanityDistime()) : humanity.getHumanityDistime() != null)
            return false;
        if (getHumanityDisplace() != null ? !getHumanityDisplace().equals(humanity.getHumanityDisplace()) : humanity.getHumanityDisplace() != null)
            return false;
        if (getHumanityImg() != null ? !getHumanityImg().equals(humanity.getHumanityImg()) : humanity.getHumanityImg() != null)
            return false;
        if (getHumanityFeature() != null ? !getHumanityFeature().equals(humanity.getHumanityFeature()) : humanity.getHumanityFeature() != null)
            return false;
        if (getUserId() != null ? !getUserId().equals(humanity.getUserId()) : humanity.getUserId() != null)
            return false;
        if (getUserName() != null ? !getUserName().equals(humanity.getUserName()) : humanity.getUserName() != null)
            return false;
        if (getUserPhone() != null ? !getUserPhone().equals(humanity.getUserPhone()) : humanity.getUserPhone() != null)
            return false;
        if (getRelationship() != null ? !getRelationship().equals(humanity.getRelationship()) : humanity.getRelationship() != null)
            return false;
        return getHumanitySuccess() != null ? getHumanitySuccess().equals(humanity.getHumanitySuccess()) : humanity.getHumanitySuccess() == null;
    }

    @Override
    public int hashCode() {
        int result = getHumanityId() != null ? getHumanityId().hashCode() : 0;
        result = 31 * result + (getHumanityName() != null ? getHumanityName().hashCode() : 0);
        result = 31 * result + (getHumanitySex() != null ? getHumanitySex().hashCode() : 0);
        result = 31 * result + (getHumanityAge() != null ? getHumanityAge().hashCode() : 0);
        result = 31 * result + (getHumanityBirthday() != null ? getHumanityBirthday().hashCode() : 0);
        result = 31 * result + (getHumanityDistime() != null ? getHumanityDistime().hashCode() : 0);
        result = 31 * result + (getHumanityDisplace() != null ? getHumanityDisplace().hashCode() : 0);
        result = 31 * result + (getHumanityImg() != null ? getHumanityImg().hashCode() : 0);
        result = 31 * result + (getHumanityFeature() != null ? getHumanityFeature().hashCode() : 0);
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        result = 31 * result + (getUserName() != null ? getUserName().hashCode() : 0);
        result = 31 * result + (getUserPhone() != null ? getUserPhone().hashCode() : 0);
        result = 31 * result + (getRelationship() != null ? getRelationship().hashCode() : 0);
        result = 31 * result + (getHumanitySuccess() != null ? getHumanitySuccess().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Humanity{" +
                "humanityId=" + humanityId +
                ", humanityName='" + humanityName + '\'' +
                ", humanitySex='" + humanitySex + '\'' +
                ", humanityAge=" + humanityAge +
                ", humanityBirthday=" + humanityBirthday +
                ", humanityDistime=" + humanityDistime +
                ", humanityDisplace='" + humanityDisplace + '\'' +
                ", humanityImg='" + humanityImg + '\'' +
                ", humanityFeature='" + humanityFeature + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", relationship='" + relationship + '\'' +
                ", humanitySuccess=" + humanitySuccess +
                '}';
    }
}
