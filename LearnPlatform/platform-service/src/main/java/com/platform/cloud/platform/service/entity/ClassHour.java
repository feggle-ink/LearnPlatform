package com.platform.cloud.platform.service.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("tb_classhour")
public class ClassHour implements Serializable {

    @TableId(type = IdType.AUTO)
    private long chId;

    private long structureId;

    /**
     * 学习时长
     */
    private int learnTime;

    /**
     * 评论内容
     */
    private String description;

    /**
     * 0-前台展示历史记录,-1-非展示历史记录,在产生新历史记录时更改
     */
    private int status;

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
    private int isValid;


    public long getChId() {
        return chId;
    }

    public void setChId(long chId) {
        this.chId = chId;
    }

    public long getStructureId() {
        return structureId;
    }

    public void setStructureId(long structureId) {
        this.structureId = structureId;
    }

    public int getLearnTime() {
        return learnTime;
    }

    public void setLearnTime(int learnTime) {
        this.learnTime = learnTime;
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
    public int getStatus() {
        return status;
    }

    /**
     * 设置0-前台展示历史记录,-1-非展示历史记录,在产生新历史记录时更改
     *
     * @param status 0-前台展示历史记录,-1-非展示历史记录,在产生新历史记录时更改
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
     * 获取0-正常,-1-删除
     *
     * @return is_valid - 0-正常,-1-删除
     */
    public int getIsValid() {
        return isValid;
    }

    /**
     * 设置0-正常,-1-删除
     *
     * @param isValid 0-正常,-1-删除
     */
    public void setIsValid(int isValid) {
        this.isValid = isValid;
    }
}