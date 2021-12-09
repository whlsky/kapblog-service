package com.kapblog.articleService.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserEntity {
    private int id;
    private String username;
    private String db_source;
}
