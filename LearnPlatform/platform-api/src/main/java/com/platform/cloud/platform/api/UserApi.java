package com.platform.cloud.platform.api;

import com.platform.cloud.platform.api.dto.UserInfoDTO;
import com.platform.cloud.platform.api.result.ApiResult;

import java.util.List;

public interface UserApi {

    /**
     * 获取人员列表
     * @return
     */
    ApiResult<List<UserInfoDTO>> getUserList();
}
