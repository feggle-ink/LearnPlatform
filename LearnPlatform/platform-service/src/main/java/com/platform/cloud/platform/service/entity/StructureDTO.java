package com.platform.cloud.platform.service.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author: yin fei
 * @description:加载目录树DTO结构
 * @date:2021/1/31
 */
public class StructureDTO implements Serializable {

    private long structureId;

    private String structureCode;

    private String structureName;

    private String pic1;

    private String pic2;

    private int sequence;

    private long clickNum;

    private int status;

    private List<StructureDTO> childList;

    public StructureDTO() {
    }

    public StructureDTO(Structure structure){
        this.structureId = structure.getStructureId();
        this.structureCode = structure.getStructureCode();
        this.structureName = structure.getStructureName();
        this.pic1 = structure.getPic1();
        this.pic2 = structure.getPic2();
        this.sequence = structure.getSequence();
        this.clickNum = structure.getClickNum();
        this.status = structure.getStatus();
    }

    public long getStructureId() {
        return structureId;
    }

    public void setStructureId(long structureId) {
        this.structureId = structureId;
    }

    public String getStructureCode() {
        return structureCode;
    }

    public void setStructureCode(String structureCode) {
        this.structureCode = structureCode;
    }

    public String getStructureName() {
        return structureName;
    }

    public void setStructureName(String structureName) {
        this.structureName = structureName;
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

    public long getClickNum() {
        return clickNum;
    }

    public void setClickNum(long clickNum) {
        this.clickNum = clickNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<StructureDTO> getChildList() {
        return childList;
    }

    public void setChildList(List<StructureDTO> childList) {
        this.childList = childList;
    }
}
