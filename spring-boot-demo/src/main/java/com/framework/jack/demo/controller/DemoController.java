package com.framework.jack.demo.controller;

import com.framework.jack.demo.base.BaseResponse;
import com.framework.jack.demo.base.HttpStatus;
import com.framework.jack.demo.util.StringUtils;
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

    @Override
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public BaseResponse login(@RequestParam String username,
                                      @RequestParam String password) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (StringUtils.equals(username, "admin") && StringUtils.equals(password, "123456")) {
            return BaseResponse.ok("登录成功");
        }
        return BaseResponse.body(HttpStatus.ERROR_USER_LOGIN);
    }
}