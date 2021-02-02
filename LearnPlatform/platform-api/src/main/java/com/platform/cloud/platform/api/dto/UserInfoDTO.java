package com.platform.cloud.platform.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfoDTO implements Serializable {

    long userId;
    String openId;
    String uname;
    String password;
    int role;
    int sex;
    String photo;
    String telephone;
    String email;




}
