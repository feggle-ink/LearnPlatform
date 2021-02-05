package com.platform.cloud.platform.client.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.platform.cloud.platform.api.FaceApi;
import com.platform.cloud.platform.api.UserDataApi;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yin fei
 * @description:页面加载控制层
 * @date:2021/1/30
 */
@RestController
@RequestMapping("/load")
public class PageLoadController {

    @Reference(version = "${dubbo.provider.version}", application = "${dubbo.application.id}")
    private FaceApi faceApi;
    @Reference(version = "${dubbo.provider.version}", application = "${dubbo.application.id}")
    private UserDataApi userDataApi;
    /**
     * 封面数据加载
     */
    @RequestMapping("/face")
    public Object faceLoad(){
        return faceApi.getFaceData();
    }

    /**
     * 类别结构点击加数
     * @param structrueId
     */
    @RequestMapping("/click/{structrueId}")
    public void clickAdd(@PathVariable long structrueId){
        faceApi.clickNumAdd(structrueId);
    }

    /**
     * 视频点击加数
     * @param courseId
     */
    @RequestMapping("/addVideo/{courseId}")
    public void addVideoClick(@PathVariable long courseId){
        faceApi.clickVideoAdd(courseId);
    }

    /**
     * 加载结构目录树
     */
    @RequestMapping("/treeLoad")
    public Object structureTreeLoad(){
        return faceApi.loadStructureTree();
    }

    /**
     * 加载视屏页数据
     * @param structureId
     * @param userId
     * @param courseId : 当为-1时，认为是从第三小类点击加载，当为真courseId，则是点击某个小节视频进行的加载
     */
    @RequestMapping("/videoPageLoad/{structureId}/{userId}/{courseId}")
    public Object videoPageLoad(@PathVariable long structureId,@PathVariable long userId,@PathVariable long courseId){
        if(courseId!=-1L)
            return userDataApi.loadUserVideoPage(userId,courseId);
        else
            return faceApi.loadVideoPage(structureId,userId);
    }

}
