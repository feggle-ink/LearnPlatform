package com.platform.cloud.platform.service.entity;

import java.io.Serializable;
import java.util.Date;

public class Collect implements Serializable{

    private long collectId;

    private long courseId;

    /**
     * 评论内容
     */
    private String description;

    private int status;

    private long createBy;

    private Date createDate;

    private long lastUpdateBy;

    private Date lastUpdateDate;

    private int rowVersion;

    /**
     * 0-正常,-1-取消收藏
     */
    private int isValid;

    /**
     * @return collect_id
     */
    public long getCollectId() {
        return collectId;
    }

    /**
     * @param collectId
     */
    public void setCollectId(long collectId) {
        this.collectId = collectId;
    }

    /**
     * @return course_id
     */
    public long getCourseId() {
        return courseId;
    }

    /**
     * @param courseId
     */
    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    /**
     * 获取评论内容
     *
     * @return description - 评论内容
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置评论内容
     *
     * @param description 评论内容
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(int status) {
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
     * 获取0-正常,-1-取消收藏
     *
     * @return is_valid - 0-正常,-1-取消收藏
     */
    public int getIsValid() {
        return isValid;
    }

    /**
     * 设置0-正常,-1-取消收藏
     *
     * @param isValid 0-正常,-1-取消收藏
     */
    public void setIsValid(int isValid) {
        this.isValid = isValid;
    }
}