/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.enums;

/**
 * �������ö����
 *
 * @author zhaojun.wzj
 * @version $Id LingganTypeEnum.java, v 0.1 2017-07-28 18:00 zhaojun.wzj Exp $$
 */
public enum LingganTypeEnum {

    /** �ı� */
    LINGGAN_TYPE_TEXT(0, "�ı�"),

    /** ��Ƶ */
    LINGGAN_TYPE_AUDIO(1, "��Ƶ"),

    /** ��Ƶ */
    LINGGAN_TYPE_VIDEO(2, "��Ƶ"),

    /** �ۺ� */
    LINGGAN_TYPE_ALL(3, "���");

    /** code */
    private int    code;

    /** ���� */
    private String desc;

    /**
     * ����
     *
     * @param code
     * @param desc
     */
    LingganTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * ���ݴ����ȡö�ٶ���
     * @param code ����
     * @return ö��
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