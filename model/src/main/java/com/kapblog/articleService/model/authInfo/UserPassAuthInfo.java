package com.kapblog.articleService.model.authInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 用户名-密码认证信息
 * <p>
 * 注意类里面有4个getter方法
 *
 * @author nona9961
 * @date 2021/12/12
 */
@Getter
@AllArgsConstructor
public class UserPassAuthInfo implements AuthInfo {

    private final String username;
    private final String password;

    @Override
    public String getPrincipal() {
        return getUsername();
    }

    @Override
    public String getCredential() {
        return getPassword();
    }
}
