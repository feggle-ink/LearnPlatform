package com.platform.cloud.platform.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    String description;
    int status;
    int create_by;
    Date create_date;
    int last_update_by;
    Date last_update_date;
    int row_version;
    int is_valid;
}
