/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.entity;

import com.fjsg.linggan.util.ToString;

/**
 * 灵感实体对象
 *
 * @author zhaojun.wzj
 * @version $Id Linggan.java, v 0.1 2017-07-28 17:55 zhaojun.wzj Exp $$
 */
public class Linggan extends ToString {

    /** serialVersionUID */
    private static final long serialVersionUID = -7370649142615226771L;

    /** id */
    private Long              id;

    /** 用户id */
    private String            userId;

    /** 内容, 暂时只支持文本类型 */
    private String            content;

    /**
     * 灵感类型
     * @see com.fjsg.linggan.service.enums.LingganTypeEnum
     */
    private int               contentType;

    /** createTime */
    private long              createTime;

    /** lastModified */
    private long              lastModified;

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>userId</tt>.
     *
     * @return property value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     *
     * @param userId value to be assigned to property userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>content</tt>.
     *
     * @return property value of content
     */
    public String getContent() {
        return content;
    }

    /**
     * Setter method for property <tt>content</tt>.
     *
     * @param content value to be assigned to property content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter method for property <tt>contentType</tt>.
     *
     * @return property value of contentType
     */
    public int getContentType() {
        return contentType;
    }

    /**
     * Setter method for property <tt>contentType</tt>.
     *
     * @param contentType value to be assigned to property contentType
     */
    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter method for property <tt>createTime</tt>.
     *
     * @return property value of createTime
     */
    public long getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for property <tt>createTime</tt>.
     *
     * @param createTime value to be assigned to property createTime
     */
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter method for property <tt>lastModified</tt>.
     *
     * @return property value of lastModified
     */
    public long getLastModified() {
        return lastModified;
    }

    /**
     * Setter method for property <tt>lastModified</tt>.
     *
     * @param lastModified value to be assigned to property lastModified
     */
    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }
}