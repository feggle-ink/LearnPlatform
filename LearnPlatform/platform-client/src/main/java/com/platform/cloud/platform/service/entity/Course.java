package com.platform.cloud.platform.service.entity;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {

    private long courseId;

    private String courseCode;

    private String courseName;

    private String video;

    private double lastStamp;

    private long structureId;

    private String teacher;

    private long playNum;

    /**
     * 时长,单位分钟
     */
    private int duration;

    private int sequence;

    /**
     * 课程介绍
     */
    private String description;

    /**
     * 封面图片
     */
    private String cover;

    /**
     * 价位0位免费
     */
    private int price;

    /**
     * 考试id
     */
    private long examId;

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
    private int isValid;

    public Course() {
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public double getLastStamp() {
        return lastStamp;
    }

    public void setLastStamp(double lastStamp) {
        this.lastStamp = lastStamp;
    }

    public long getStructureId() {
        return structureId;
    }

    public void setStructureId(long structureId) {
        this.structureId = structureId;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public long getPlayNum() {
        return playNum;
    }

    public void setPlayNum(long playNum) {
        this.playNum = playNum;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getExamId() {
        return examId;
    }

    public void setExamId(long examId) {
        this.examId = examId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public long getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public int getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(int rowVersion) {
        this.rowVersion = rowVersion;
    }

    public int getValid() {
        return isValid;
    }

    public void setValid(int valid) {
        isValid = valid;
    }
}