package com.platform.cloud.platform.api;

import com.platform.cloud.platform.api.entity.History;
import com.platform.cloud.platform.api.result.ApiResult;

import java.util.List;

/**
 * @author: yin fei
 * @description:用户数据管理
 * @date:2021/2/1
 */
public interface UserDataApi {

    /**
     * 加载用户的学习记录及收藏
     */
    public ApiResult loadHistoryCollect(long userId);

    /**
     * 翻页加载用户学习历史记录
     */
    public ApiResult loadPageHistory(int page,int num,long userId);

    /**
     * 翻页加载用户收藏记录
     */
    public ApiResult loadPageCollect(int page,int num,long userId);

    /**
     * 取消收藏
     */
    public ApiResult cancelCollect(long userId, long courseId);

    /**
     * 添加收藏
     */
    public ApiResult addCollect(long userId, long courseId);

    /**
     * 切出播放视屏，记录当前用户观看历史
     */
    public ApiResult addHistory(List<History> hisList,int duration,long structureId,long userId);

    /**
     * 视屏播放完成后，增加看完视屏的记录
     * @param userId
     * @param courseId
     */
    public ApiResult finishCourse(long userId,long courseId);

    /**
     * 从历史记录、收藏点击加载到视频播放页
     * @param userId
     * @param courseId
     * @return
     */
    public ApiResult loadUserVideoPage(long userId,long courseId);

}
