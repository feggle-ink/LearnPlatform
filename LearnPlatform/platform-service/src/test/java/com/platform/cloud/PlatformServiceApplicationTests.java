package com.platform.cloud;

import com.platform.cloud.platform.service.entity.User;
import com.platform.cloud.platform.service.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
class PlatformServiceApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println("=============================");
        log.info("日志记录测试================");
        for (User user : userMapper.selectList(null)) {
            System.out.println("+++++++++++++" + user);
            System.out.println(user.getUname()+"--------------");
            System.out.println(user.getCreateDate()+"--------------");
        }
    }

    @Test
    void insertTest(){
        User user = new User();
        user.setOpenId("weixin0009");
        user.setUname("李四");
        user.setEmail("99999999@qq.com");
        user.setCreateDate(new Date());
        userMapper.insert(user);
    }

    @Test
    void getUserByDate(){
        User user = userMapper.findByDate(new Date());
        System.out.print(user);
    }

    //多表联查测试
    @Test
    void findCommentUser(){
        User commentUser = userMapper.findCommentUser();
        System.out.print(commentUser.getUname()+"======"+commentUser.getUserId()+"======"+commentUser.getCreateDate());
    }

}
