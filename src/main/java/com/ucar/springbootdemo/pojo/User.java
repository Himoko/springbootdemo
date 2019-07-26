package com.ucar.springbootdemo.pojo;

/**
 * @program: hellovue
 * @description: 用户类
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-07-18 10:06
 */
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userEmail;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
