package com.kapblog.userService.service;

import com.kapblog.core.model.authInfo.AuthInfo;
import com.kapblog.core.model.entity.UserEntity;

/**
 * @author nona9961
 * @date 2021/12/11
 */
public interface UserService {

    /**
     * 通过认证信息获取用户信息
     *
     * @param authInfo 认证信息
     * @return 用户信息
     */
    UserEntity getUserByAuth(AuthInfo authInfo);

}
