package com.framework.jack.demo.entity.user;

/**
 * 用户信息
 *
 * @author jack
 */
public class UserInfo {

    private Integer userId;

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}