package com.framework.jack.demo.controller;

import com.framework.jack.demo.base.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author jack
 */
@Api(tags = "示例", description = "这个是一个Demo", value = "demo")
public interface DemoApi {
    
    @ApiOperation(value = "用户登录")
    @ApiResponses({
        @ApiResponse(code = 200, response = String.class, message = "登录结果"),
    })
    BaseResponse<String> login(@ApiParam(value = "账号", required = true) String username,
                               @ApiParam(value = "密码", required = true) String password);

    @ApiOperation(value = "用户注册")
    @ApiResponses({
        @ApiResponse(code = 200, response = String.class, message = "注册结果"),
    })
    BaseResponse<String> register(@ApiParam(value = "邮箱", required = true) String email,
                                  @ApiParam(value = "账号", required = true) String username,
                                  @ApiParam(value = "密码", required = true) String password);
}
