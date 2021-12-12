package com.kapblog.userService.component.auth;

import com.kapblog.articleService.model.authInfo.AuthInfo;
import com.kapblog.articleService.model.authInfo.EmailVerifyAuthInfo;
import com.kapblog.articleService.model.entity.UserEntity;

import java.util.Optional;

/**
 * @author nona9961
 * @date 2021/12/12
 */
public class EmailAuthenticator implements Authenticator {
    @Override
    public boolean isApplicable(AuthInfo authInfo) {
        return authInfo instanceof EmailVerifyAuthInfo;
    }

    @Override
    public Optional<UserEntity> authenticate(AuthInfo authInfo) {
        if (!isApplicable(authInfo)) {
            return Optional.empty();
        }
        EmailVerifyAuthInfo emailInfo = (EmailVerifyAuthInfo) authInfo;
        return null;
    }
}
