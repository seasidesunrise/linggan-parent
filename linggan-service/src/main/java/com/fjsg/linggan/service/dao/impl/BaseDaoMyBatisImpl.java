/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.fjsg.linggan.service.dao.BaseDao;

/**
 * DAO mybatisʵ��
 * 
 * @author zhaojun.wzj
 * @version $Id BaseDaoMyBatisImpl.java, v 0.1 2017-07-30 22:54 zhaojun.wzj Exp $$
 */
public class BaseDaoMyBatisImpl<T, PK extends Serializable> implements BaseDao<T, PK> {

    /** sqlSessionTemplate */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * DAO�������Entity����
     */
    protected String           clazzName;

    public BaseDaoMyBatisImpl() {
        Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
            .getActualTypeArguments()[0];
        clazzName = clazz.getName() + "Mapper";
    }

    /**
     * ����ʵ�����
     *
     * @param obj
     * @return
     */
    @Override
    public T save(T obj) {
        sqlSessionTemplate.insert(clazzName + ".save", obj);
        return null;
    }

    /**
     * ��ȡʵ�����
     *
     * @param id ����id
     * @return
     */
    @Override
    public T get(PK id) {
        T t = sqlSessionTemplate.selectOne(clazzName + ".get", id);
        return t;
    }

    /**
     * ɾ��ʵ�����
     *
     * @param id
     * @return
     */
    @Override
    public boolean delete(PK id) {
        int rowCount = sqlSessionTemplate.delete(clazzName + ".delete", id);
        return rowCount > 0;
    }

    /**
     * ����ʵ�����
     *
     * @param obj
     * @return
     */
    @Override
    public boolean update(T obj) {
        int rowCount = sqlSessionTemplate.update(clazzName + ".update", obj);

        return rowCount > 0;
    }

    /**
     * ������ȡʵ�����
     *
     * @param map
     * @return
     */
    @Override
    public List<T> findListByMap(Map<String, Object> map) {
        return sqlSessionTemplate.selectList(clazzName + ".list", map);
    }
}