package com.platform.cloud.platform.service.entity;

import java.io.Serializable;
import java.util.Date;

public class Active implements Serializable{

    private long activeId;

    /**
     * 员工工号
     */
    private int employeeCode;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 身份证后六位
     */
    private String employeeIdCard;

    private long userId;

    private String description;

    private Boolean status;

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
     * @return active_id
     */
    public long getActiveId() {
        return activeId;
    }

    /**
     * @param activeId
     */
    public void setActiveId(long activeId) {
        this.activeId = activeId;
    }

    /**
     * 获取员工工号
     *
     * @return employee_code - 员工工号
     */
    public int getEmployeeCode() {
        return employeeCode;
    }

    /**
     * 设置员工工号
     *
     * @param employeeCode 员工工号
     */
    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    /**
     * 获取员工姓名
     *
     * @return employee_name - 员工姓名
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置员工姓名
     *
     * @param employeeName 员工姓名
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 获取身份证后六位
     *
     * @return employee_idcard - 身份证后六位
     */
    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    /**
     * 设置身份证后六位
     *
     * @param employeeIdCard 身份证后六位
     */
    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    /**
     * @return user_id
     */
    public long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
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
     * @return create_by
     */
    public long getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
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