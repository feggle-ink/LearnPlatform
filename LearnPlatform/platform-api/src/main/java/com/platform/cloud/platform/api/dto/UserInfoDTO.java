package com.platform.cloud.platform.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfoDTO implements Serializable {

    int user_id;
    String open_id;
    String uname;
    String password;
    int role;
    int sex;
    String photo;
    String telephone;
    String email;




}
