/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * DAO��������
 *
 * @author zhaojun.wzj
 * @version $Id BaseDao.java, v 0.1 2017-07-30 22:50 zhaojun.wzj Exp $$
 */
public interface BaseDao<T, PK extends Serializable> {

    /**
     * ����ʵ�����
     *
     * @param obj
     * @return
     */
    T save(T obj);

    /**
     * ��ȡʵ�����
     *
     * @param id ����id
     * @return
     */
    T get(PK id);

    /**
     * ɾ��ʵ�����
     *
     * @param id
     * @return
     */
    boolean delete(PK id);

    /**
     * ����ʵ�����
     * 
     * @param obj
     * @return
     */
    boolean update(T obj);

    /**
     * ������ȡʵ�����
     * 
     * @param map
     * @return
     */
    List<T> findListByMap(Map<String, Object> map);
}