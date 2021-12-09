package com.kapblog.articleService.service.impl;

import com.kapblog.articleService.mapper.AuthResourceMapper;
import com.kapblog.articleService.model.AuthResource;
import com.kapblog.articleService.service.AuthResourceService;
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
