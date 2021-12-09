package com.kapblog.articleService.service.impl;

import com.kapblog.articleService.mapper.AuthRoleMapper;
import com.kapblog.articleService.model.entity.AuthRole;
import com.kapblog.articleService.service.AuthRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表——不同的角色应该有不同的权限 服务实现类
 * </p>
 *
 * @author nona9961
 * @since 2021-12-09
 */
@Service
public class AuthRoleServiceImpl extends ServiceImpl<AuthRoleMapper, AuthRole> implements AuthRoleService {

}
