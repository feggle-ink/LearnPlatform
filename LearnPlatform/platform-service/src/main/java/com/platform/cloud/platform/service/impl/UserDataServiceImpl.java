package com.platform.cloud.platform.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.platform.cloud.platform.api.UserDataApi;
import com.platform.cloud.platform.api.entity.History;
import com.platform.cloud.platform.api.result.ApiResult;
import com.platform.cloud.platform.service.constant.ConstantConfig;
import com.platform.cloud.platform.service.entity.ClassHour;
import com.platform.cloud.platform.service.entity.Collect;
import com.platform.cloud.platform.service.entity.Course;
import com.platform.cloud.platform.service.entity.Structure;
import com.platform.cloud.platform.service.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author: yin fei
 * @description:用户数据管理
 * @date:2021/2/1
 */
@Service(version = "${dubbo.provider.version}", application = "${dubbo.application.id}")
public class UserDataServiceImpl implements UserDataApi {

    @Autowired
    CollectMapper collectMapper;
    @Autowired
    HistoryMapper historyMapper;
    @Autowired
    ClassHourMapper classHourMapper;
    @Autowired
    StructureMapper structureMapper;
    @Autowired
    CourseMapper courseMapper;

    @Override
    @Transactional(readOnly = true)
    public ApiResult loadHistoryCollect(long userId) {

        List<Course> historyCourse = historyMapper.getHistoryCourse(userId, ConstantConfig.HISTORY_NUM);
        List<Course> collectCourse = collectMapper.getCollectCourse(userId, ConstantConfig.COLLECT_NUM);

        HashMap<Object, Object> loadHashMap = new HashMap<>();
        loadHashMap.put("historyCourse",historyCourse);
        loadHashMap.put("collectCourse",collectCourse);

        return ApiResult.success(loadHashMap);
    }

    /**
     * 取消收藏
     * @param userId
     * @param courseId
     */
    @Override
    @Transactional(rollbackFor = Throwable.class)
    public ApiResult cancelCollect(long userId, long courseId) {

        QueryWrapper<Collect> collectQueryWrapper = new QueryWrapper<>();
        collectQueryWrapper.eq("create_by",userId);
        collectQueryWrapper.eq("course_id",courseId);
        Collect judgeCollect = collectMapper.selectOne(collectQueryWrapper);

        if(judgeCollect!=null){
            judgeCollect.setIsValid(-1);
            collectMapper.updateById(judgeCollect);
        }
        return ApiResult.success();
    }

    /**
     * 添加收藏
     * @param userId
     * @param courseId
     */
    @Override
    @Transactional(rollbackFor = Throwable.class)
    public ApiResult addCollect(long userId, long courseId) {

        QueryWrapper<Collect> collectQueryWrapper = new QueryWrapper<>();
        collectQueryWrapper.eq("create_by",userId);
        collectQueryWrapper.eq("course_id",courseId);
        Collect judgeCollect = collectMapper.selectOne(collectQueryWrapper);

        if(judgeCollect==null){
            Collect collect = new Collect();
            collect.setCreateBy(userId);
            collect.setCourseId(courseId);
            collect.setCreateDate(new Date());
            collectMapper.insert(collect);
        }else{
            judgeCollect.setIsValid(0);
            judgeCollect.setCreateDate(new Date());
            collectMapper.updateById(judgeCollect);
        }

        return ApiResult.success();
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public ApiResult addHistory(List<History> hisList, int duration, long structureId, long userId) {

        if(hisList!=null&&hisList.size()!=0)
            historyMapper.addHistory(hisList,userId);

        ClassHour classHour = new ClassHour();
        classHour.setCreateDate(new Date());
        classHour.setCreateBy(userId);
        classHour.setLearnTime(duration);
        classHour.setStructureId(structureId);

        classHourMapper.insert(classHour);
        return ApiResult.success();
    }

    @Override
    public ApiResult finishCourse(long userId, long courseId) {

        History history = new History();
        history.setCourseId(courseId);
        history.setCreateBy(userId);
        history.setCreateDate(new Date());
        history.setStatus(-1);

        historyMapper.insert(history);
        return ApiResult.success();
    }

    @Override
    @Transactional(readOnly = true)
    public ApiResult loadUserVideoPage(long userId, long courseId) {

        Structure structure = structureMapper.getStructureByCourseId(courseId);

        List<Course> courseWithHistory = courseMapper.getCourseWithHistory(structure.getStructureId(), userId);

        HashMap<Object, Object> loadHashMap = new HashMap<>();

        loadHashMap.put("structure",structure);
        loadHashMap.put("latestCourseId",courseId);
        loadHashMap.put("courseWithHistory",courseWithHistory);

        return ApiResult.success(loadHashMap);
    }

}
