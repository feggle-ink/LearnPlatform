package com.platform.cloud.platform.client.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.platform.cloud.platform.api.UserApi;
import com.platform.cloud.platform.api.dto.UserInfoDTO;
import com.platform.cloud.platform.api.result.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version = "${dubbo.provider.version}", application = "${dubbo.application.id}")
    private UserApi userApi;

    @RequestMapping("/list")
    public Object getAllUser(){
        System.out.println("输出所有人员");
        return userApi.getUserList();
    }


}
