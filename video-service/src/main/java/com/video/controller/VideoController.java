package com.video.controller;

import com.kapblog.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class VideoController {

    private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/user/listUser")
    public List<UserEntity> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+ "user/listUser", List.class);
    }
}
