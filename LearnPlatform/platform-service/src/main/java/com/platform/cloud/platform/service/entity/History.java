package com.platform.cloud.platform.service.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("tb_history")
public class History implements Serializable {

    @TableId(type = IdType.AUTO)
    private long historyId;

    private long courseId;

    /**
     * 最后一次观看的时间戳
     */
    private int lastStamp;

    /**
     * 观看该视频总时长
     */
    private int totalTime;

    /**
     * 评论内容
     */
    private String description;

    /**
     * 0-前台展示历史记录,-1-非展示历史记录,在产生新历史记录时更改
     */
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
     * @return history_id
     */
    public long getHistoryId() {
        return historyId;
    }

    /**
     * @param historyId
     */
    public void setHistoryId(long historyId) {
        this.historyId = historyId;
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
     * 获取最后一次观看的时间戳
     *
     * @return last_stamp - 最后一次观看的时间戳
     */
    public int getLastStamp() {
        return lastStamp;
    }

    /**
     * 设置最后一次观看的时间戳
     *
     * @param lastStamp 最后一次观看的时间戳
     */
    public void setLastStamp(int lastStamp) {
        this.lastStamp = lastStamp;
    }

    /**
     * 获取观看该视频总时长
     *
     * @return total_time - 观看该视频总时长
     */
    public int getTotalTime() {
        return totalTime;
    }

    /**
     * 设置观看该视频总时长
     *
     * @param totalTime 观看该视频总时长
     */
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
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
     * 获取0-前台展示历史记录,-1-非展示历史记录,在产生新历史记录时更改
     *
     * @return status - 0-前台展示历史记录,-1-非展示历史记录,在产生新历史记录时更改
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置0-前台展示历史记录,-1-非展示历史记录,在产生新历史记录时更改
     *
     * @param status 0-前台展示历史记录,-1-非展示历史记录,在产生新历史记录时更改
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