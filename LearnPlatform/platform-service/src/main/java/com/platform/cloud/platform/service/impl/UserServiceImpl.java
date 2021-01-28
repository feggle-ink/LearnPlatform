package com.platform.cloud.platform.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.platform.cloud.platform.api.UserApi;
import com.platform.cloud.platform.api.dto.UserInfoDTO;
import com.platform.cloud.platform.api.result.ApiResult;
import com.platform.cloud.platform.service.entity.User;
import com.platform.cloud.platform.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service(version = "${dubbo.provider.version}", application = "${dubbo.application.id}")
public class UserServiceImpl implements UserApi {

    @Autowired
    UserMapper userMapper;

    @Override
    public ApiResult<List<UserInfoDTO>> getUserList() {
        List<User> users = userMapper.selectList(null);
        List<UserInfoDTO> userInfoDTOList = new ArrayList<>();
        for (User user : users) {
            UserInfoDTO userInfoDTO = new UserInfoDTO();
            userInfoDTO.setUser_id(user.getUser_id());
            userInfoDTO.setEmail(user.getEmail());
            userInfoDTOList.add(userInfoDTO);
        }
        return ApiResult.success(userInfoDTOList);
    }
}
