package com.platform.cloud.platform.service.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{
    @TableId(type = IdType.AUTO)
    int user_id;
    String open_id;
    String uname;
    String password;
    int role;
    int sex;
    String photo;
    String telephone;
    String email;
    String description;
    int status;
    int create_by;
    @TableField("create_date")
    Date create_date;
    int last_update_by;
    Date last_update_date;
    int row_version;
    int is_valid;

}
