/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fjsg.linggan.service.dao.LingganOriDAO;
import com.fjsg.linggan.service.entity.Linggan;

/**
 * @author zhaojun.wzj
 * @version $Id LingganDAOImpl.java, v 0.1 2017-07-28 18:36 zhaojun.wzj Exp $$
 */
//@Repository
public class LingganOriDAOImpl implements LingganOriDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public Linggan get(Long id) {
        Linggan linggan = sqlSessionTemplate
            .selectOne("com.fjsg.linggan.service.entity.LingganMapper.get", id);
        return linggan;
    }

    @Override
    public boolean delete(Long id) {
        int rowCount = sqlSessionTemplate
            .delete("com.fjsg.linggan.service.entity.LingganMapper.delete", id);
        return rowCount > 0;
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
        int rowCount = sqlSessionTemplate
            .update("com.fjsg.linggan.service.entity.LingganMapper.update", linggan);

        return rowCount > 0;
    }

    @Override
    public List<Linggan> findListByMap(Map map) {
        List<Linggan> result = sqlSessionTemplate
            .selectList("com.fjsg.linggan.service.entity.LingganMapper.list", map);
        return result;
    }

}