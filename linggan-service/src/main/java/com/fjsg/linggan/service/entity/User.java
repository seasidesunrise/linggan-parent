/**
 * Alipay.com Inc.
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.fjsg.linggan.service.entity;

import com.fjsg.linggan.util.ToString;

/**
 * @author zhaojun.wzj
 * @version $Id User.java, v 0.1 2017-07-31 00:03 zhaojun.wzj Exp $$
 */
public class User extends ToString {

    /** serialVersionUID */
    private static final long serialVersionUID = 4316472799037422752L;

    /** 用户id */
    private long              id;

    /** 用户手机号 */
    private long              mobile;

    /** 昵称 */
    private String            nickName;

    /** 真实姓名 */
    private String            realName;

    /** 身份证号码 */
    private String            idCard;

    /** 审核状态 未审核 (0); 审核通过 (1) */
    private int               authStatus;

    /** 个人头像地址 */
    private String            portrait;

    /** 个人简介 */
    private String            description;

    /** 性别 未知(0)、男(1)、女(2) */
    private int               gender;

    /** 生日 */
    private Long              birthday;

    /** 最后登录时间 */
    private Long              lastLoginTime;

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public long getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>mobile</tt>.
     *
     * @return property value of mobile
     */
    public long getMobile() {
        return mobile;
    }

    /**
     * Setter method for property <tt>mobile</tt>.
     *
     * @param mobile value to be assigned to property mobile
     */
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    /**
     * Getter method for property <tt>nickName</tt>.
     *
     * @return property value of nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Setter method for property <tt>nickName</tt>.
     *
     * @param nickName value to be assigned to property nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * Getter method for property <tt>realName</tt>.
     *
     * @return property value of realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * Setter method for property <tt>realName</tt>.
     *
     * @param realName value to be assigned to property realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * Getter method for property <tt>idCard</tt>.
     *
     * @return property value of idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * Setter method for property <tt>idCard</tt>.
     *
     * @param idCard value to be assigned to property idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * Getter method for property <tt>authStatus</tt>.
     *
     * @return property value of authStatus
     */
    public int getAuthStatus() {
        return authStatus;
    }

    /**
     * Setter method for property <tt>authStatus</tt>.
     *
     * @param authStatus value to be assigned to property authStatus
     */
    public void setAuthStatus(int authStatus) {
        this.authStatus = authStatus;
    }

    /**
     * Getter method for property <tt>portrait</tt>.
     *
     * @return property value of portrait
     */
    public String getPortrait() {
        return portrait;
    }

    /**
     * Setter method for property <tt>portrait</tt>.
     *
     * @param portrait value to be assigned to property portrait
     */
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    /**
     * Getter method for property <tt>description</tt>.
     *
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for property <tt>description</tt>.
     *
     * @param description value to be assigned to property description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter method for property <tt>gender</tt>.
     *
     * @return property value of gender
     */
    public int getGender() {
        return gender;
    }

    /**
     * Setter method for property <tt>gender</tt>.
     *
     * @param gender value to be assigned to property gender
     */
    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * Getter method for property <tt>birthday</tt>.
     *
     * @return property value of birthday
     */
    public Long getBirthday() {
        return birthday;
    }

    /**
     * Setter method for property <tt>birthday</tt>.
     *
     * @param birthday value to be assigned to property birthday
     */
    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    /**
     * Getter method for property <tt>lastLoginTime</tt>.
     *
     * @return property value of lastLoginTime
     */
    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Setter method for property <tt>lastLoginTime</tt>.
     *
     * @param lastLoginTime value to be assigned to property lastLoginTime
     */
    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}