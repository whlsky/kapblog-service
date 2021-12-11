package com.kapblog.userService.service;

import com.kapblog.articleService.model.entity.BaseAuth;
import com.kapblog.articleService.model.entity.UserEntity;

/**
 * @author nona9961
 * @date 2021/12/11
 */
public interface UserService {

    /**
     * 通过认证信息获取用户信息
     *
     * @param baseAuth 认证信息
     * @return 用户信息
     */
    UserEntity getUserByAuth(BaseAuth baseAuth);

}
