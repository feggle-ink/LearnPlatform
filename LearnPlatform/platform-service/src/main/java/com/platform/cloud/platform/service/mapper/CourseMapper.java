package com.platform.cloud.platform.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.platform.cloud.platform.service.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: yin fei
 * @description:小节视频课程
 * @date:2021/1/31
 */
public interface CourseMapper extends BaseMapper<Course> {

    public List<Course> getCourseWithHistory(@Param("structureId") long structureId, @Param("userId") long userId);

    public Course getLatestCourse(@Param("structureId") long structureId, @Param("userId") long userId);

    public void clickCourseAdd(@Param("courseId") long courseId);
}
