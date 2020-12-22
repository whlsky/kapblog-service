package com.kapblog.dao;

import com.kapblog.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<UserEntity> findAll();
}
