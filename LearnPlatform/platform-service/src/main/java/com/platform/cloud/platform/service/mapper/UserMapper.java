package com.platform.cloud.platform.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.platform.cloud.platform.service.entity.User;

import java.util.Date;

public interface UserMapper extends BaseMapper<User>{

    public User findByDate(Date date);

    public User findCommentUser();

}
