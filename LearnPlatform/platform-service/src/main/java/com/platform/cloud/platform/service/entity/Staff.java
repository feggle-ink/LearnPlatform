package com.platform.cloud.platform.service.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("tb_staff")
public class Staff {

    @TableId(type = IdType.AUTO)
    private long staffId;

    private String staffName;

    /**
     * MD5加密
     */
    private String password;

    /**
     * 0-男,1-女
     */
    private Boolean sex;

    /**
     * 1-管理员, 2-超级管理员
     */
    private Boolean role;

    private String description;

    private Boolean status;

    /**
     * 0为自动生成
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
     * @return staff_id
     */
    public long getStaffId() {
        return staffId;
    }

    /**
     * @param staffId
     */
    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    /**
     * @return staff_name
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * @param staffName
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * 获取MD5加密
     *
     * @return password - MD5加密
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置MD5加密
     *
     * @param password MD5加密
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取0-男,1-女
     *
     * @return sex - 0-男,1-女
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 设置0-男,1-女
     *
     * @param sex 0-男,1-女
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 获取1-管理员, 2-超级管理员
     *
     * @return role - 1-管理员, 2-超级管理员
     */
    public Boolean getRole() {
        return role;
    }

    /**
     * 设置1-管理员, 2-超级管理员
     *
     * @param role 1-管理员, 2-超级管理员
     */
    public void setRole(Boolean role) {
        this.role = role;
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
     * 获取0为自动生成
     *
     * @return create_by - 0为自动生成
     */
    public long getCreateBy() {
        return createBy;
    }

    /**
     * 设置0为自动生成
     *
     * @param createBy 0为自动生成
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