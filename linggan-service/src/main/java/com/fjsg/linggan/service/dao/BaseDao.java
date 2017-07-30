/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * DAO基础抽象
 *
 * @author zhaojun.wzj
 * @version $Id BaseDao.java, v 0.1 2017-07-30 22:50 zhaojun.wzj Exp $$
 */
public interface BaseDao<T, PK extends Serializable> {

    /**
     * 新增实体对象
     *
     * @param obj
     * @return
     */
    T save(T obj);

    /**
     * 获取实体对象
     *
     * @param id 对象id
     * @return
     */
    T get(PK id);

    /**
     * 删除实体对象
     *
     * @param id
     * @return
     */
    boolean delete(PK id);

    /**
     * 更新实体对象
     * 
     * @param obj
     * @return
     */
    boolean update(T obj);

    /**
     * 批量获取实体对象
     * 
     * @param map
     * @return
     */
    List<T> findListByMap(Map<String, Object> map);
}