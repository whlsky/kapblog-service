package com.kapblog.userService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nona9961
 * @date 2021/12/9 18:25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/testGateWay")
    public String route() {
        return "test";
    }

}
