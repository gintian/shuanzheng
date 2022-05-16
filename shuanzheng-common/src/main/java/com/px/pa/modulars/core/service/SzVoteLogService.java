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

package com.px.pa.modulars.core.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.px.pa.modulars.core.entity.SzVoteLog;
import org.apache.ibatis.annotations.Param;

/**
 * 投票记录
 *
 * @author pig code generator
 * @date 2021-04-13 11:25:35
 */
public interface SzVoteLogService extends IService<SzVoteLog> {


    Page<SzVoteLog> getListPage( Page page, String voteName, String voteItem);

}
