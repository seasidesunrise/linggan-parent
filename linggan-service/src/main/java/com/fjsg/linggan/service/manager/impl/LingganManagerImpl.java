/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.manager.impl;

import java.util.List;
import java.util.Map;

import com.fjsg.linggan.service.dao.LingganDAO;
import com.fjsg.linggan.service.entity.Linggan;
import com.fjsg.linggan.service.manager.LingganManager;

/**
 * @author zhaojun.wzj
 * @version $Id LingganManagerImpl.java, v 0.1 2017-07-28 18:39 zhaojun.wzj Exp $$
 */
public class LingganManagerImpl implements LingganManager {

    /** lingganDAO */
    private LingganDAO lingganDAO;

    /**
     * @param id
     * @return
     */
    @Override
    public Linggan get(Long id) {
        return lingganDAO.get(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public boolean delete(Long id) {
        return lingganDAO.delete(id);
    }

    /**
     * @param linggan
     * @return
     */
    @Override
    public boolean delete(Linggan linggan) {
        return lingganDAO.delete(linggan);
    }

    /**
     * @param linggan
     * @return
     */
    @Override
    public Linggan save(Linggan linggan) {
        return lingganDAO.save(linggan);
    }

    /**
     * @param linggan
     * @return
     */
    @Override
    public boolean update(Linggan linggan) {
        return lingganDAO.update(linggan);
    }

    /**
     * @param map
     * @return
     */
    @Override
    public List<Linggan> findListByMap(Map map) {
        return lingganDAO.findListByMap(map);
    }

}