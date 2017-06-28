package com.framework.jack.demo.service;

import com.framework.jack.demo.controller.user.model.RegisterInfoModel;
import com.framework.jack.demo.entity.User;
import com.framework.jack.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jack
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(String username, String password) {
        return userMapper.login(username, password);
    }

    public void register(RegisterInfoModel registerInfo) {
        //TODO 判断用户名是否存在
        //TODO 判断邮箱是否已注册
        //TODO 插入
    }
}
