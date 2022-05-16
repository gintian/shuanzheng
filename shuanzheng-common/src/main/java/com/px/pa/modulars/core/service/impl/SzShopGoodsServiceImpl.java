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

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.px.pa.modulars.core.entity.SzShopGoods;
import com.px.pa.modulars.core.mapper.SzShopGoodsMapper;
import com.px.pa.modulars.core.service.SzShopGoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 积分商品
 *
 * @author pig code generator
 * @date 2021-04-13 11:25:35
 */
@Service
@Transactional
public class SzShopGoodsServiceImpl extends ServiceImpl<SzShopGoodsMapper, SzShopGoods> implements SzShopGoodsService {

    @Override
    public SzShopGoods readDetail(Integer id) {
        SzShopGoods goods = super.getById(id);
        goods.setViews(goods.getViews() == null ? 1 : (goods.getViews() + 1));
        super.updateById(goods);
        return goods;
    }
}
