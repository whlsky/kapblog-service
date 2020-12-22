package com.kapblog.controller;

import com.kapblog.model.UserEntity;
import com.kapblog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user/listUser")
    public List<UserEntity> listUser(){
        return userService.listUser();
    }
}
