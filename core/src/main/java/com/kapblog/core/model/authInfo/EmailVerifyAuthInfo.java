package com.kapblog.core.model.authInfo;

import com.kapblog.core.constant.Regexp;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * 邮件-验证码
 *
 * @author nona9961
 * @date 2021/12/12
 */
@Getter
public class EmailVerifyAuthInfo extends AbstractVerifyCodeAuthInfo {

    private final String emailAddress;

    public EmailVerifyAuthInfo(String emailAddress, String verifyCode) {
        super(verifyCode);
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean isValidPrincipal() {
        return StringUtils.isNotBlank(emailAddress) && emailAddress.matches(Regexp.EMAIL_REG);
    }

    @Override
    public String getPrincipal() {
        return getEmailAddress();
    }
}
