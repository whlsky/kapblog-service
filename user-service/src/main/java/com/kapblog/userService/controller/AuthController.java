package com.kapblog.userService.controller;

import com.kapblog.articleService.model.authInfo.AbstractVerifyCodeAuthInfo;
import com.kapblog.articleService.model.authInfo.AuthInfo;
import com.kapblog.articleService.model.authInfo.UserPassAuthInfo;
import com.kapblog.articleService.model.http.Response;
import com.kapblog.userService.service.AuthService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 用户权限相关api
 *
 * @author hu mingcheng
 * @date 2021/12/13 16:25
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Resource
    private AuthService authService;

    @PostMapping("/login")
    public Response<?> login(@RequestBody @Valid AuthInfo authInfo) {

        return null;
    }

    @PostMapping("/register")
    public Response<?> register(@RequestBody @Valid UserPassAuthInfo userPassAuthInfo) {
        authService.register(userPassAuthInfo);
        return Response.success();
    }

    @GetMapping("/registerByEmail/{emailAddress}")
    public Response<?> registerByEmail(@PathVariable("emailAddress") String emailAddress) {
        authService.registerByEmail(emailAddress);
        return Response.success();
    }

    @GetMapping("/registerByPhone/{phoneNumber}")
    public Response<?> registerByPhone(@PathVariable("phoneNumber") String phoneNumber) {
        authService.registerByPhone(phoneNumber);
        return Response.success();
    }

    @PostMapping("/registerByVerifyCode")
    public Response<?> registerByVerifyCode(@RequestBody @Valid AbstractVerifyCodeAuthInfo abstractVerifyCodeAuthInfo) {
        authService.register(abstractVerifyCodeAuthInfo);
        return Response.success();
    }
}
