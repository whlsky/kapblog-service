package com.kapblog.articleService.model.authInfo;

/**
 * 认证信息接口，需要身份(principal)和证明(credential)两个信息匹配
 *
 * <h3>用户名-密码形式</h3>
 * 一般的用户名密码登录的话，这里的
 * principal=username;
 * credential=password
 * <h3>短信-验证码形式</h3>
 * 如果是短信验证码的话，这里的
 * principal=phone number
 * credential=verify code
 *
 * @author nona9961
 * @date 2021/12/11
 */
public interface AuthInfo {

    /**
     * 返回身份信息
     *
     * @return 身份信息
     */
    String getPrincipal();

    /**
     * 返回认证信息
     *
     * @return 认证信息
     */
    String getCredential();
}
