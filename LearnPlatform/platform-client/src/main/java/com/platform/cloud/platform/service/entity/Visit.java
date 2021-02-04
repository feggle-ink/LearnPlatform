package com.platform.cloud.platform.service.entity;

import java.util.Date;

public class Visit {

    private long visitId;

    private String description;

    private Boolean status;

    /**
     * user_id
     */
    private long createBy;

    private Date createDate;

    private long lastUpdateBy;

    private Date lastUpdateDate;

    private int rowVersion;

    /**
     * 0-正常,-1-删除
     */
    private Boolean isValid;

    /**
     * @return visit_id
     */
    public long getVisitId() {
        return visitId;
    }

    /**
     * @param visitId
     */
    public void setVisitId(long visitId) {
        this.visitId = visitId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取user_id
     *
     * @return create_by - user_id
     */
    public long getCreateBy() {
        return createBy;
    }

    /**
     * 设置user_id
     *
     * @param createBy user_id
     */
    public void setCreateBy(long createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return last_update_by
     */
    public long getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * @param lastUpdateBy
     */
    public void setLastUpdateBy(long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    /**
     * @return last_update_date
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * @return row_version
     */
    public int getRowVersion() {
        return rowVersion;
    }

    /**
     * @param rowVersion
     */
    public void setRowVersion(int rowVersion) {
        this.rowVersion = rowVersion;
    }

    /**
     * 获取0-正常,-1-删除
     *
     * @return is_valid - 0-正常,-1-删除
     */
    public Boolean getIsValid() {
        return isValid;
    }

    /**
     * 设置0-正常,-1-删除
     *
     * @param isValid 0-正常,-1-删除
     */
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }
}