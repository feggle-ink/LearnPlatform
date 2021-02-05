package com.platform.cloud.platform.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.platform.cloud.platform.api.entity.History;
import com.platform.cloud.platform.service.entity.Course;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: yin fei
 * @description:用户浏览历史
 * @date:2021/1/31
 */
public interface HistoryMapper extends BaseMapper<History>{

    public List<Course> getHistoryCourse(@Param("userId") long userId, @Param("page") int page, @Param("num") int num);

    public int addHistory(@Param("hisList")List<History> hisList, @Param("userId")long userId);
}
