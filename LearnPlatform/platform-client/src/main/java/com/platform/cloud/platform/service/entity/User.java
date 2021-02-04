package com.platform.cloud.platform.service.entity;

import java.util.Date;

public class User {

    private long userId;

    private String openId;

    private String nickname;

    private String uname;

    /**
     * 企业员工激活码
     */
    private String password;

    /**
     * 员工权限, 0-非企业员工, 1-企业员工
     */
    private Boolean role;

    /**
     * 0-男,1-女
     */
    private Boolean sex;

    private String photo;

    private long departId;

    private String telephone;

    private String email;

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

    private Boolean isValid;

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
     * @return open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * @return uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     *
     * @return
     */
    public String getNickname() {
        return nickname;
    }

    /**
     *
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取企业员工激活码
     *
     * @return password - 企业员工激活码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置企业员工激活码
     *
     * @param password 企业员工激活码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取员工权限, 0-非企业员工, 1-企业员工
     *
     * @return role - 员工权限, 0-非企业员工, 1-企业员工
     */
    public Boolean getRole() {
        return role;
    }

    /**
     * 设置员工权限, 0-非企业员工, 1-企业员工
     *
     * @param role 员工权限, 0-非企业员工, 1-企业员工
     */
    public void setRole(Boolean role) {
        this.role = role;
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
     * @return photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return depart_id
     */
    public long getDepartId() {
        return departId;
    }

    /**
     * @param departId
     */
    public void setDepartId(long departId) {
        this.departId = departId;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return is_valid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    /**
     * @param isValid
     */
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }
}