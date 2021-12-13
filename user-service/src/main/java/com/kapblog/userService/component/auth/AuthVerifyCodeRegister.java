package com.kapblog.userService.component.auth;

import com.kapblog.articleService.model.authInfo.AuthInfo;

/**
 * @author nona9961
 * @date 2021/12/13 17:01
 */
public interface AuthVerifyCodeRegister extends AuthInfo {

    String send(String principal);

    void afterRegister();

}
