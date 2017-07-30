/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.util;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author zhaojun.wzj
 * @version $Id ToString.java, v 0.1 2017-07-28 17:55 zhaojun.wzj Exp $$
 */
public class ToString implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 6053078855322284118L;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}