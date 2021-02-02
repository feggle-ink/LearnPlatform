package com.platform.cloud.platform.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.platform.cloud.platform.service.entity.Structure;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: yin fei
 * @description:课程结构
 * @date:2021/1/30
 */
public interface StructureMapper extends BaseMapper<Structure> {

    /**
     *获取热门课程
     * @return
     */
    public List<Structure> getHotStructure(@Param("pid") long pid,@Param("num") int num);

    /**
     * 类别点击后，增加点击量
     */
    public void clickAdd(@Param("structureId")long structureId);

    /**
     * 加载整个目录树
     */
    void loadStructureTree();
}
