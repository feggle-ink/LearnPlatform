package com.platform.cloud.platform.api;

import com.platform.cloud.platform.api.result.ApiResult;

public interface FaceApi {

    /**
     * 获取封面数据
     * @return
     */
    public ApiResult getFaceData();

    /**
     * 点击，对各类计数
     */
    public void clickNumAdd(long structrueId);

    /**
     * 加载目录树
     */
    public ApiResult loadStructureTree();

    /**
     * 加载播放页数据
     */
    public ApiResult loadVideoPage(long structrueId,long userId);

    /**
     * 点击视频，增加播放次数
     * @param courseId
     */
    public void clickVideoAdd(long courseId);
}
