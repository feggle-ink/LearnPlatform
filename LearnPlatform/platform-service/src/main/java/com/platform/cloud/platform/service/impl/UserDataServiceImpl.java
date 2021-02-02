package com.platform.cloud.platform.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.platform.cloud.platform.api.UserDataApi;
import com.platform.cloud.platform.api.result.ApiResult;
import com.platform.cloud.platform.service.constant.ConstantConfig;
import com.platform.cloud.platform.service.entity.Collect;
import com.platform.cloud.platform.service.entity.Course;
import com.platform.cloud.platform.service.entity.History;
import com.platform.cloud.platform.service.mapper.CollectMapper;
import com.platform.cloud.platform.service.mapper.HistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Override
    public ApiResult loadHistoryCollect(long userId) {

        List<Course> historyCourse = historyMapper.getHistoryCourse(userId, ConstantConfig.HISTORY_NUM);



        return null;
    }

    @Override
    public ApiResult addCollect(long userId) {
        return null;
    }

    @Override
    public ApiResult cancelCollect(long collect_id,long userId) {
        return null;
    }

}
