package com.kapblog.articleService.model.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 认证基类，需要身份(principals)和证明(credentials)两个信息匹配
 *
 * <h3>用户名-密码形式</h3>
 * 一般的用户名密码登录的话，这里的
 * principals=username;
 * credentials=password
 * <h3>短信-验证码形式</h3>
 * 如果是短信验证码的话，这里的
 * principals=phone number
 * credentials=verify code
 *
 * @author nona9961
 * @date 2021/12/11
 */
@Data
public class BaseAuth {
    @NotNull(message = "principal can not be null")
    protected String principals;
    @NotNull(message = "credentials can not be null")
    protected String credentials;
}
