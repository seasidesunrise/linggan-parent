/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fjsg.linggan.service.entity.Linggan;
import com.fjsg.linggan.service.enums.LingganTypeEnum;

/**
 * ¡È∏–DAOµ•‘™≤‚ ‘
 *
 * @author zhaojun.wzj
 * @version $Id LingganOriDAOImplTest.java, v 0.1 2017-07-28 20:46 zhaojun.wzj Exp $$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class LingganDaoImplTest {

    @Resource
    private LingganDaoImpl lingganDao;

    @Test
    public void testGet() {
        Long id = 6L;
        Linggan linggan = lingganDao.get(id);

        System.out.println(linggan);
    }

    @Test
    public void testSave() {
        Linggan linggan = new Linggan();
        linggan.setUserId("3");
        linggan.setContent("testYY");
        linggan.setContentType(LingganTypeEnum.LINGGAN_TYPE_TEXT.getCode());
        long curTime = System.currentTimeMillis();
        linggan.setCreateTime(curTime);
        linggan.setLastModified(curTime);

        lingganDao.save(linggan);
    }

    @Test
    public void testDelete() {
        Long id = 10L;
        boolean linggan = lingganDao.delete(id);

        System.out.println(linggan);
    }

    @Test
    public void testUpdate() {
        Long id = 15L;
        Linggan linggan = lingganDao.get(id);
        linggan.setContent("88" + linggan.getContent());
        boolean result = lingganDao.update(linggan);

        System.out.println(result);
    }

    @Test
    public void testGetBatch() {
        String userId = "2";
        Map<String, Object> paramMap = new HashMap<String, Object>(1);
        paramMap.put("userId", userId);
        List<Linggan> lingganList = lingganDao.findListByMap(paramMap);
        System.out.println(lingganList);
    }

}