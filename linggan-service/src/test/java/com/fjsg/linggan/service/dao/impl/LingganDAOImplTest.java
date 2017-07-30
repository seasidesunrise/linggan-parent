/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.dao.impl;

import org.junit.Test;

import com.fjsg.linggan.service.entity.Linggan;
import com.fjsg.linggan.service.enums.LingganTypeEnum;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * ¡È∏–DAOµ•‘™≤‚ ‘
 *
 * @author zhaojun.wzj
 * @version $Id LingganDAOImplTest.java, v 0.1 2017-07-28 20:46 zhaojun.wzj Exp $$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class LingganDAOImplTest {

    @Resource
    private LingganDAOImpl lingganDAO;

    @Test
    public void testSave() {
        Linggan linggan = new Linggan();
        linggan.setUserId("2");
        linggan.setContent("testXX");
        linggan.setContentType(LingganTypeEnum.LINGGAN_TYPE_TEXT.getCode());
        long curTime = System.currentTimeMillis();
        linggan.setCreateTime(curTime);
        linggan.setLastModified(curTime);

        lingganDAO.save(linggan);
    }


}