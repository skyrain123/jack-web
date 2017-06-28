package com.framework.jack.demo.controller;

import com.framework.jack.demo.base.BaseResponse;
import com.framework.jack.demo.base.HttpStatus;
import com.framework.jack.demo.entity.User;
import com.framework.jack.demo.service.UserService;
import com.framework.jack.demo.util.StringUtils;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jack
 */
@RestController
@RequestMapping("/demo")
public class DemoController implements DemoApi {

    @Autowired
    private UserService userService;

    @Override
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public BaseResponse login(@ApiParam(value = "账号", required = true) @RequestParam String username,
                              @ApiParam(value = "密码", required = true) @RequestParam String password) {
        User user = userService.login(username, password);
        if (user != null) {
            return BaseResponse.ok("登录成功");
        }
        return BaseResponse.body(HttpStatus.ERROR_USER_LOGIN);
    }

    @Override
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public BaseResponse register(@ApiParam(value = "邮箱", required = true) @RequestParam String email,
                                 @ApiParam(value = "账号", required = true) @RequestParam String username,
                                 @ApiParam(value = "密码", required = true) @RequestParam String password) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (StringUtils.equals(username, "admin") && StringUtils.equals(password, "123456")) {
            return BaseResponse.ok("注册成功");
        }
        return BaseResponse.body(HttpStatus.ERROR_USER_LOGIN);
    }
}