/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.dao.impl;

import com.fjsg.linggan.service.dao.LingganDAO;
import com.fjsg.linggan.service.entity.Linggan;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author zhaojun.wzj
 * @version $Id LingganDAOImpl.java, v 0.1 2017-07-28 18:36 zhaojun.wzj Exp $$
 */
@Repository
public class LingganDAOImpl implements LingganDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public Linggan get(Long id) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean delete(Linggan linggan) {
        return false;
    }

    @Override
    public Linggan save(Linggan linggan) {
        sqlSessionTemplate.insert("com.fjsg.linggan.service.entity.LingganMapper.save", linggan);

        return linggan;
    }

    @Override
    public boolean update(Linggan linggan) {
        return false;
    }

    @Override
    public List<Linggan> findListByMap(Map map) {
        return null;
    }
}