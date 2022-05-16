/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */
package com.px.pa.modulars.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.px.pa.modulars.core.entity.SzGuideUser;
import com.px.pa.modulars.core.entity.SzUser;
import com.px.pa.modulars.core.mapper.SzGuideUserMapper;
import com.px.pa.modulars.core.service.SzGuideUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 办事指南审核人列表
 *
 * @author pig code generator
 * @date 2021-05-06 17:12:18
 */
@Service
@Transactional
public class SzGuideUserServiceImpl extends ServiceImpl<SzGuideUserMapper, SzGuideUser> implements SzGuideUserService {

    @Override
    public List<SzUser> getUser(QueryWrapper query) {
        return super.getBaseMapper().getUser(query);
    }
}
