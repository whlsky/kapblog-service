package com.kapblog.userService.component.auth;

import com.kapblog.articleService.model.authInfo.AuthInfo;
import com.kapblog.articleService.model.entity.UserEntity;

import java.util.Optional;

/**
 * 权限认证的策略接口
 *
 * @author nona9961
 * @date 2021/12/11
 */
public interface Authenticator {

    /**
     * 根据认证信息认证对应用户，结果使用Optional包裹，要求显式处理没有对应用户的情况
     *
     * @param authInfo 认证信息
     * @return 由Optional包裹的用户信息
     */
    Optional<UserEntity> authenticate(AuthInfo authInfo);

}
