/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.enums;

/**
 * 灵感类型枚举类
 *
 * @author zhaojun.wzj
 * @version $Id LingganTypeEnum.java, v 0.1 2017-07-28 18:00 zhaojun.wzj Exp $$
 */
public enum LingganTypeEnum {

    /** 文本 */
    LINGGAN_TYPE_TEXT(0, "文本"),

    /** 音频 */
    LINGGAN_TYPE_AUDIO(1, "音频"),

    /** 视频 */
    LINGGAN_TYPE_VIDEO(2, "视频"),

    /** 综合 */
    LINGGAN_TYPE_ALL(3, "混合");

    /** code */
    private int    code;

    /** 描述 */
    private String desc;

    /**
     * 构造
     *
     * @param code
     * @param desc
     */
    LingganTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据代码获取枚举对象
     * @param code 代码
     * @return 枚举
     */
    public static LingganTypeEnum valueOf(int code) {
        LingganTypeEnum[] lingganTypeEnums = values();
        for (LingganTypeEnum lingganEnum : lingganTypeEnums) {
            if (lingganEnum.getCode() == code) {
                return lingganEnum;
            }
        }
        return null;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public int getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     *
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property <tt>desc</tt>.
     *
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}