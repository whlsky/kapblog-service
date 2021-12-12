package com.kapblog.articleService.model.authInfo;

import lombok.Data;

/**
 * 验证码抽象类
 *
 * @author nona9961
 * @date 2021/12/12
 */
@Data
public abstract class AbstractVerifyCodeAuthInfo implements AuthInfo {

    protected final String verifyCode;

    @Override
    public String getCredential() {
        return getVerifyCode();
    }

    /**
     * 看身份信息是否符合相应的格式
     * <p>
     * 比如邮件地址需要@，手机号需要11位等
     *
     * @return 是否符合格式
     */
    public abstract boolean isValidPrincipal();
}
