package com.platform.cloud.platform.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.platform.cloud.platform.service.entity.Collect;
import com.platform.cloud.platform.service.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: yin fei
 * @description:收藏映射
 * @date:2021/2/1
 */
public interface CollectMapper extends BaseMapper<Collect>{

    public List<Course> getCollectCourse(@Param("userId") long userId,@Param("page") int page, @Param("num") int num);

}
