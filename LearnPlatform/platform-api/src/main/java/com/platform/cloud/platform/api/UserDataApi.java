package com.platform.cloud.platform.api;

import com.platform.cloud.platform.api.result.ApiResult;

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
     * 添加收藏
     */
    public ApiResult addCollect(long userId);

    /**
     * 取消收藏
     */
    public ApiResult cancelCollect(long collect_id,long userId);

}
