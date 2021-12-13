package com.kapblog.userService.service;

import com.kapblog.articleService.model.authInfo.AuthInfo;

/**
 * 和权限相关
 *
 * @author hu mingcheng
 * @date 2021/12/13 16:27
 */
public interface AuthService {


    /**
     * 通过邮箱注册，属于验证码注册的一种
     *
     * @param emailAddress 邮箱地址
     * @return 邮箱验证码，注意不能返回给用户
     */
    String registerByEmail(String emailAddress);

    /**
     * 通过短信注册，属于验证码注册的一种
     *
     * @param phone 手机号
     * @return 短信验证码，注意不能返回给用户
     */
    String registerByPhone(String phone);

    /**
     * 真正的注册方法，根据authInfo选择不同的注册器来完成注册
     *
     * @param authInfo 注册信息
     */
    void register(AuthInfo authInfo);

}
