package com.kapblog.userService.controller;

import com.kapblog.articleService.model.entity.BaseAuth;
import com.kapblog.articleService.model.http.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author nona9961
 * @date 2021/12/9 18:25
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @PostMapping("/login")
    public Response<?> login(@RequestBody @Valid BaseAuth baseAuth) {

        return null;
    }
}
