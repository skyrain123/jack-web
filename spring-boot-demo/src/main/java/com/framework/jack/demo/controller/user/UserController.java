package com.framework.jack.demo.controller.user;

import com.framework.jack.demo.base.BaseResponse;
import com.framework.jack.demo.base.HttpStatus;
import com.framework.jack.demo.controller.user.model.RegisterInfoModel;
import com.framework.jack.demo.entity.User;
import com.framework.jack.demo.service.UserService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jack
 */
@RestController
@RequestMapping("/user")
public class UserController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public BaseResponse register(@ApiParam(value = "注册信息", required = true) @RequestBody RegisterInfoModel registerInfo) {
        userService.register(registerInfo);
        return BaseResponse.ok("注册成功");
    }

    @Override
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse<String> login(@ApiParam(value = "账号", required = true) @RequestParam String username,
                                      @ApiParam(value = "密码", required = true) @RequestParam String password) {
        User user = userService.login(username, password);
        if (user != null) {
            return BaseResponse.ok("登录成功");
        }
        return BaseResponse.body(HttpStatus.ERROR_USER_LOGIN);
    }

}
