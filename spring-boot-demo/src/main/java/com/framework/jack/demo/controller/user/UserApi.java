package com.framework.jack.demo.controller.user;

import com.framework.jack.demo.base.BaseResponse;
import com.framework.jack.demo.controller.user.model.RegisterInfoModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 用户API
 *
 * @author jack
 */
@Api(tags = "用户", description = "用户相关API")
public interface UserApi {

    @ApiOperation(value = "用户注册")
    @ApiResponses({
        @ApiResponse(code = 200, response = String.class, message= "注册成功"),
    })
    BaseResponse register(@ApiParam(value = "注册信息", required = true) RegisterInfoModel registerInfo);

    @ApiOperation(value = "用户登录")
    @ApiResponses({
        @ApiResponse(code = 200, response = String.class, message = "登录成功"),
    })
    BaseResponse<String> login(@ApiParam(value = "账号", required = true) String username,
                               @ApiParam(value = "密码", required = true) String password);
}
