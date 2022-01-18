package com.kapblog.core.service.impl;

import com.kapblog.core.mapper.AuthResourceMapper;
import com.kapblog.core.model.entity.AuthResource;
import com.kapblog.core.service.AuthResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表——记录restful形式下，所有的api 服务实现类
 * </p>
 *
 * @author nona9961
 * @since 2021-12-09
 */
@Service
public class AuthResourceServiceImpl extends ServiceImpl<AuthResourceMapper, AuthResource> implements AuthResourceService {

}
