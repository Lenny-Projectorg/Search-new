package com.find.search.entity;

public class Found {
    private Integer foundId;
    private String foundName;
    private String foundImg;
    private String foundFeature;
    private String foundPlace;
    private Integer userId;
    private String userName;
    private String userPhone;
    private String foundUsername;
    private Integer foundSuccess;   //将Integer改为String

    private Integer page;
    private Integer pageRow;

    public Integer getFoundId() {
        return foundId;
    }

    public void setFoundId(Integer foundId) {
        this.foundId = foundId;
    }

    public String getFoundName() {
        return foundName;
    }

    public void setFoundName(String foundName) {
        this.foundName = foundName;
    }

    public String getFoundImg() {
        return foundImg;
    }

    public void setFoundImg(String foundImg) {
        this.foundImg = foundImg;
    }

    public String getFoundFeature() {
        return foundFeature;
    }

    public void setFoundFeature(String foundFeature) {
        this.foundFeature = foundFeature;
    }

    public String getFoundPlace() {
        return foundPlace;
    }

    public void setFoundPlace(String foundPlace) {
        this.foundPlace = foundPlace;
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

    public String getFoundUsername() {
        return foundUsername;
    }

    public void setFoundUsername(String foundUsername) {
        this.foundUsername = foundUsername;
    }

    public Integer getFoundSuccess() {
        return foundSuccess;
    }

    public void setFoundSuccess(Integer foundSuccess) {
        this.foundSuccess = foundSuccess;
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
        if (!(o instanceof Found)) return false;

        Found found = (Found) o;

        if (getFoundId() != null ? !getFoundId().equals(found.getFoundId()) : found.getFoundId() != null) return false;
        if (getFoundName() != null ? !getFoundName().equals(found.getFoundName()) : found.getFoundName() != null)
            return false;
        if (getFoundImg() != null ? !getFoundImg().equals(found.getFoundImg()) : found.getFoundImg() != null)
            return false;
        if (getFoundFeature() != null ? !getFoundFeature().equals(found.getFoundFeature()) : found.getFoundFeature() != null)
            return false;
        if (getFoundPlace() != null ? !getFoundPlace().equals(found.getFoundPlace()) : found.getFoundPlace() != null)
            return false;
        if (getUserId() != null ? !getUserId().equals(found.getUserId()) : found.getUserId() != null) return false;
        if (getUserName() != null ? !getUserName().equals(found.getUserName()) : found.getUserName() != null)
            return false;
        if (getUserPhone() != null ? !getUserPhone().equals(found.getUserPhone()) : found.getUserPhone() != null)
            return false;
        if (getFoundUsername() != null ? !getFoundUsername().equals(found.getFoundUsername()) : found.getFoundUsername() != null)
            return false;
        if (getFoundSuccess() != null ? !getFoundSuccess().equals(found.getFoundSuccess()) : found.getFoundSuccess() != null)
            return false;
        if (getPage() != null ? !getPage().equals(found.getPage()) : found.getPage() != null) return false;
        return getPageRow() != null ? getPageRow().equals(found.getPageRow()) : found.getPageRow() == null;
    }

    @Override
    public int hashCode() {
        int result = getFoundId() != null ? getFoundId().hashCode() : 0;
        result = 31 * result + (getFoundName() != null ? getFoundName().hashCode() : 0);
        result = 31 * result + (getFoundImg() != null ? getFoundImg().hashCode() : 0);
        result = 31 * result + (getFoundFeature() != null ? getFoundFeature().hashCode() : 0);
        result = 31 * result + (getFoundPlace() != null ? getFoundPlace().hashCode() : 0);
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        result = 31 * result + (getUserName() != null ? getUserName().hashCode() : 0);
        result = 31 * result + (getUserPhone() != null ? getUserPhone().hashCode() : 0);
        result = 31 * result + (getFoundUsername() != null ? getFoundUsername().hashCode() : 0);
        result = 31 * result + (getFoundSuccess() != null ? getFoundSuccess().hashCode() : 0);
        result = 31 * result + (getPage() != null ? getPage().hashCode() : 0);
        result = 31 * result + (getPageRow() != null ? getPageRow().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Found{" +
                "foundId=" + foundId +
                ", foundName='" + foundName + '\'' +
                ", foundImg='" + foundImg + '\'' +
                ", foundFeature='" + foundFeature + '\'' +
                ", foundPlace='" + foundPlace + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", foundUsername='" + foundUsername + '\'' +
                ", foundSuccess=" + foundSuccess +
                ", page=" + page +
                ", pageRow=" + pageRow +
                '}';
    }
}
