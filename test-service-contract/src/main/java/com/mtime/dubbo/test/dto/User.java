package com.mtime.dubbo.test.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by jankie on 16/5/1.
 */
public class User implements Serializable {

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String userId;

    private String userName;

    private String password;

    private String sex;

    private String email;
}
