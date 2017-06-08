package com.framework.jack.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

/**
 * @author jack
 */
@Api(tags = "示例", description = "这个是一个Demo", value = "demo")
public interface DemoApi {
    
    @ApiOperation(value = "用户登录")
    @ApiResponses({
        @ApiResponse(code = 200, response = String.class, message = "登录结果"),
    })
    ResponseEntity<String> login(@ApiParam(value = "账号", required = true) String username,
                                 @ApiParam(value = "密码", required = true) String password);
}
