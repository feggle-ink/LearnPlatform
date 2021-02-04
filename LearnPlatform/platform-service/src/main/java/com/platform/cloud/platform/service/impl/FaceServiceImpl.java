package com.platform.cloud.platform.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.platform.cloud.platform.api.FaceApi;
import com.platform.cloud.platform.api.result.ApiResult;
import com.platform.cloud.platform.service.constant.ConstantConfig;
import com.platform.cloud.platform.service.entity.*;
import com.platform.cloud.platform.service.mapper.CourseMapper;
import com.platform.cloud.platform.service.mapper.HistoryMapper;
import com.platform.cloud.platform.service.mapper.MaqueeMapper;
import com.platform.cloud.platform.service.mapper.StructureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * @author: yin fei
 * @description:封面数据加载实现
 * @date:2021/1/30
 */
@Service(version = "${dubbo.provider.version}", application = "${dubbo.application.id}")
public class FaceServiceImpl implements FaceApi {

    @Autowired
    MaqueeMapper maqueeMapper;
    @Autowired
    StructureMapper structureMapper;
    @Autowired
    CourseMapper courseMapper;
    @Autowired
    HistoryMapper historyMapper;

    /**
     * 获取封面，轮播、IT热门课程、PD热门课程
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public ApiResult getFaceData() {

        QueryWrapper<Maquee> maqueeWrapper = new QueryWrapper<>();
        maqueeWrapper.orderByAsc("sequence").eq("status",ConstantConfig.ALIVE_STATUS).last("limit "+ConstantConfig.MAQUUE_NUM);
        List<Maquee> maquees = maqueeMapper.selectList(maqueeWrapper);

        List<Structure> ITList = structureMapper.getHotStructure(ConstantConfig.IT_PID,ConstantConfig.REC_NUM);
        List<Structure> PDList = structureMapper.getHotStructure(ConstantConfig.PD_PID,ConstantConfig.REC_NUM);

        HashMap<String, List> faceMap = new HashMap<>();

        faceMap.put("maquees",maquees);
        faceMap.put("ITList",ITList);
        faceMap.put("PDList",PDList);

        return ApiResult.success(faceMap);

    }

    /**
     * 某个类别的点击量记录
     * @param structrueId
     */
    @Override
    public void clickNumAdd(long structrueId) {

        structureMapper.clickAdd(structrueId);

    }

    /**
     * 加载目录树
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public ApiResult loadStructureTree() {

        QueryWrapper<Structure> structureQueryWrapper = new QueryWrapper<Structure>();
        structureQueryWrapper.eq("pid",0).eq("status",ConstantConfig.ALIVE_STATUS);
        List<Structure> pList = structureMapper.selectList(structureQueryWrapper);
        List<StructureDTO> pDTOList = convertStructureDTO(pList);
        loadStructureDTOTree(pDTOList);
        return ApiResult.success(pDTOList);
    }

    /**
     * 加载播放视频页数据
     * @param structrueId
     * @param userId
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public ApiResult loadVideoPage(long structrueId,long userId) {

        Structure structure = structureMapper.selectById(structrueId);

        long latestCourseId = -1L;
        Course latestCourse = courseMapper.getLatestCourse(structrueId,userId);

        if(latestCourse!=null)
            latestCourseId = latestCourse.getCourseId();

        List<Course> courseWithHistory = courseMapper.getCourseWithHistory(structrueId, userId);

        if(latestCourse==null&&courseWithHistory!=null&&courseWithHistory.size()!=0&&courseWithHistory.get(0)!=null)
            latestCourseId = courseWithHistory.get(0).getCourseId();

        HashMap<Object, Object> loadHashMap = new HashMap<>();

        loadHashMap.put("structure",structure);
        loadHashMap.put("latestCourseId",latestCourseId);
        loadHashMap.put("courseWithHistory",courseWithHistory);

        return ApiResult.success(loadHashMap);
    }

    /**
     * 点击视频，播放量+1
     * @param courseId
     */
    @Override
    public void clickVideoAdd(long courseId) {
        courseMapper.clickCourseAdd(courseId);
    }

    /**
     * 递归构建目录树
     * @param pDTOList
     */
    private void loadStructureDTOTree(List<StructureDTO> pDTOList){

        if(pDTOList==null || pDTOList.size()==0)
            return;

        for (StructureDTO structureDTO : pDTOList) {
            QueryWrapper<Structure> structureQueryWrapper = new QueryWrapper<Structure>();
            structureQueryWrapper.eq("pid",structureDTO.getStructureId());
            List<Structure> pList = structureMapper.selectList(structureQueryWrapper);
            List<StructureDTO> dList = convertStructureDTO(pList);
            structureDTO.setChildList(dList);
            loadStructureDTOTree(dList);
        }
    }

    /**
     * 转化为DTO的list
     * @param pList
     * @return
     */
    private List<StructureDTO> convertStructureDTO(List<Structure> pList){
        if(pList==null||pList.size()==0)
            return null;
        List<StructureDTO> pDTOList = new ArrayList<>();
        for (Structure structure : pList) {
            pDTOList.add(new StructureDTO(structure));
        }
        return pDTOList;
    }

}
