package com.platform.cloud.platform.service.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("tb_structure")
public class Structure implements Serializable{

    @TableId(type = IdType.AUTO)
    private long structureId;

    private String structureCode;

    private String structureName;

    /**
     * 大类pid=0
     */
    private long pid;

    /**
     * 大类中类为图标,小类为图片
     */
    private String pic1;

    /**
     * 大类中类为图标,小类为图片
     */
    private String pic2;

    private int sequence;

    /**
     * 点击量
     */
    private long clickNum;

     /**
     * 您将获得
     */
    private String harvest;

    private String description;

    /**
     * 0-公共的,1-企业内部
     */
    private int status;

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
     * @return structure_id
     */
    public long getStructureId() {
        return structureId;
    }

    /**
     * @param structureId
     */
    public void setStructureId(long structureId) {
        this.structureId = structureId;
    }

    /**
     * @return structure_code
     */
    public String getStructureCode() {
        return structureCode;
    }

    /**
     * @param structureCode
     */
    public void setStructureCode(String structureCode) {
        this.structureCode = structureCode;
    }

    /**
     * @return structure_name
     */
    public String getStructureName() {
        return structureName;
    }

    /**
     * @param structureName
     */
    public void setStructureName(String structureName) {
        this.structureName = structureName;
    }

    /**
     * 获取大类pid=0
     *
     * @return pid - 大类pid=0
     */
    public long getPid() {
        return pid;
    }

    /**
     * 设置大类pid=0
     *
     * @param pid 大类pid=0
     */
    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    /**
     * 获取点击量
     *
     * @return click_num - 点击量
     */
    public long getClickNum() {
        return clickNum;
    }

    /**
     * 设置点击量
     *
     * @param clickNum 点击量
     */
    public void setClickNum(long clickNum) {
        this.clickNum = clickNum;
    }

    /**
     * 获取收获
     * @return
     */
    public String getHarvest() {
        return harvest;
    }

    /**
     * 设置收获
     * @param harvest
     */
    public void setHarvest(String harvest) {
        this.harvest = harvest;
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
     * 获取0-公共的,1-企业内部
     *
     * @return status - 0-公共的,1-企业内部
     */
    public int getStatus() {
        return status;
    }

    /**
     * 设置0-公共的,1-企业内部
     *
     * @param status 0-公共的,1-企业内部
     */
    public void setStatus(int status) {
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