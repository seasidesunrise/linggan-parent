/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.manager;

import java.util.List;
import java.util.Map;

import com.fjsg.linggan.service.entity.Linggan;

/**
 * ¡È∏–manager≥ÈœÛ¿‡
 *
 * @author zhaojun.wzj
 * @version $Id LingganManager.java, v 0.1 2017-07-28 18:38 zhaojun.wzj Exp $$
 */
public interface LingganManager {

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