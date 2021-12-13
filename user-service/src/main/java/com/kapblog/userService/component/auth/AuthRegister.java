package com.kapblog.userService.component.auth;

import com.kapblog.articleService.model.authInfo.AuthInfo;

/**
 * 注册的策略接口
 *
 * @author nona9961
 * @date 2021/12/13 16:53
 */
public interface AuthRegister {


    void register(AuthInfo authInfo);

}
