package com.platform.cloud;

import com.platform.cloud.platform.service.entity.User;
import com.platform.cloud.platform.service.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class PlatformServiceApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println("=============================");
        for (User user : userMapper.selectList(null)) {
            System.out.println(user.getUser_id()+"+++++++++++++");
            System.out.println(user.getUname()+"--------------");
            System.out.println(user.getCreate_date()+"--------------");
            System.out.println("");
        }
    }

    @Test
    void insertTest(){
        User user = new User();
        user.setOpen_id("weixin0009");
        user.setUname("李四");
        user.setEmail("99999999@qq.com");
        user.setCreate_date(new Date());
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
        System.out.print(commentUser.getUname()+"======"+commentUser.getUser_id()+"======"+commentUser.getCreate_date());
    }

}
