package com.platform.cloud.platform.client.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.platform.cloud.platform.api.UserDataApi;
import com.platform.cloud.platform.api.entity.History;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: yin fei
 * @description:页面加载控制层
 * @date:2021/2/1
 */
@RestController
@RequestMapping("/user")
public class UserDataController {

    @Reference(version = "${dubbo.provider.version}", application = "${dubbo.application.id}")
    private UserDataApi userDataApi;

    /**
     * 加载历史、收藏页
     * @param userId
     */
    @RequestMapping("/historyCollectLoad/{userId}")
    public Object historyCollectLoad(@PathVariable long userId){
        return userDataApi.loadHistoryCollect(userId);
    }

    /**
     * 添加收藏记录
     * @param userId
     * @param courseId
     */
    @RequestMapping("/addCollect/{userId}/{courseId}")
    public Object addCollect(@PathVariable long userId, @PathVariable long courseId){
        return userDataApi.addCollect(userId,courseId);
    }

    /**
     * 取消收藏记录
     * @param userId
     * @param courseId
     */
    @RequestMapping("cancelCollect/{userId}/{courseId}")
    public Object cancelCollect(@PathVariable long userId, @PathVariable long courseId){
        return userDataApi.cancelCollect(userId,courseId);
    }

    /**
     * 记录学习历史记录
     * videoRecord
     * @param userId
     */
    @RequestMapping("/addHistory")
    public Object addHistory(@RequestParam("duration") int duration,@RequestParam("structureId") long structureId,@RequestParam("userId") long userId, @RequestParam("videoRecord") String videoRecord){

        JSONArray vJarr = JSON.parseArray(videoRecord);
        List<History> hisList = new ArrayList<>();
        for (Object obj : vJarr) {
            JSONObject jObj = (JSONObject) obj;
            History history = new History();
            history.setCourseId(jObj.getLong("level4Id"));
            history.setLastStamp(jObj.getIntValue("currentTime"));
            history.setCreateDate(new Date());
            hisList.add(history);
        }

        return userDataApi.addHistory(hisList,duration,structureId,userId);
    }

    /**
     * 完成视频观看，触发完成历史
     * @param userId
     * @param courseId
     */
    @RequestMapping("/finishCourse/{userId}/{courseId}")
    public Object finishCourse(@PathVariable long userId,@PathVariable long courseId){
        return userDataApi.finishCourse(userId,courseId);
    }

    /**
     * 从观看历史、收藏夹点击加载的视屏页面数据
     * @param courseId
     * @param userId
     */
    @RequestMapping("/loadVideoPageFromHC/{courseId}/{userId}")
    public Object loadVideoPageFromHC(@PathVariable long courseId,@PathVariable long userId){
        return userDataApi.loadUserVideoPage(userId,courseId);
    }

}
