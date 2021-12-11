package com.kapblog.userService.component.auth;

import com.kapblog.articleService.model.entity.BaseAuth;

/**
 * 权限认证的策略接口
 *
 * @author nona9961
 * @date 2021/12/11
 */
public interface Authenticator {

    boolean isApplicable(BaseAuth baseAuth);


}
