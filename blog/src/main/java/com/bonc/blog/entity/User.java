package com.bonc.blog.entity;

import java.io.Serializable;

/**
 * 用户信息实体
 */
public class User implements Serializable {

    private Integer id; //id

    private String userName; //用户名

    private String password; //密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}