/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.dao;

import java.util.List;
import java.util.Map;

import com.fjsg.linggan.service.entity.Linggan;

/**
 * 灵感对象数据访问抽象
 *
 * @author zhaojun.wzj
 * @version $Id LingganOriDAO.java, v 0.1 2017-07-28 17:54 zhaojun.wzj Exp $$
 */
public interface LingganOriDAO {

    /**
     *
     * @param id
     * @return
     */
    Linggan get(Long id);

    /**
     *
     * @param id
     * @return
     */
    boolean delete(Long id);

    /**
     *
     * @param linggan
     * @return
     */
    boolean delete(Linggan linggan);

    /**
     *
     * @param linggan
     * @return
     */
    Linggan save(Linggan linggan);

    /**
     *
     * @param linggan
     * @return
     */
    boolean update(Linggan linggan);

    /**
     *
     * @param map
     * @return
     */
    List<Linggan> findListByMap(Map map);

}