package com.platform.cloud.platform.client.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.platform.cloud.platform.api.FaceApi;
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

    @RequestMapping("/face")
    public Object faceLoad(){
        return faceApi.getFaceData();
    }

    @RequestMapping("/click/{structrueId}")
    public void clickAdd(@PathVariable long structrueId){
        faceApi.clickNumAdd(structrueId);
    }

    @RequestMapping("/treeLoad")
    public Object structureTreeLoad(){
        return faceApi.loadStructureTree();
    }

    @RequestMapping("/videoPageLoad/{structureId}/{userId}")
    public Object videoPageLoad(@PathVariable long structureId,@PathVariable long userId){
        return faceApi.loadVideoPage(structureId,userId);
    }

}
