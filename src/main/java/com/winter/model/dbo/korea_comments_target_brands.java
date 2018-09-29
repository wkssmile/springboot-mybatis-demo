package com.winter.model.dbo;

import java.util.Date;

public class korea_comments_target_brands {
    private Long pkId;

    private Integer brandIndex;

    private String brandStatus;

    private String brandName;

    private Date insertTime;

    private Date updateTime;

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public Integer getBrandIndex() {
        return brandIndex;
    }

    public void setBrandIndex(Integer brandIndex) {
        this.brandIndex = brandIndex;
    }

    public String getBrandStatus() {
        return brandStatus;
    }

    public void setBrandStatus(String brandStatus) {
        this.brandStatus = brandStatus == null ? null : brandStatus.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}