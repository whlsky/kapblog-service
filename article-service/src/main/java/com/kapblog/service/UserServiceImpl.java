package com.kapblog.service;

import com.kapblog.dao.UserDao;
import com.kapblog.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> listUser() {
        return userDao.findAll();
    }
}
