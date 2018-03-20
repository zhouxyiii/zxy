package com.oa.bean;

/**
 * Created by Teori on 2018/3/19.
 */
public class User {

    private Integer userId;

    private String userName;

    private String userPassword;

    private String userSex;

    private String userEmail;

    private Department departmentBean;

    public Department getDepartmentBean() {
        return departmentBean;
    }

    public void setDepartmentBean(Department departmentBean) {
        this.departmentBean = departmentBean;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

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

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}