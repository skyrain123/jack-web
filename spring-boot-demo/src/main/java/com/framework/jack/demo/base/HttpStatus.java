package com.framework.jack.demo.base;


/**
 * @author jack
 */
public class HttpStatus {

    public static final HttpStatus OK = instance(200, "操作成功");
    public static final HttpStatus BAD = instance(500, "服务器错误");
    public static final HttpStatus ERROR = instance(1000, "执行失败");

    public static final HttpStatus ERROR_USER_LOGIN = instance(1101, "账号或密码错误");

    /** 状态码 */
    private int code;

    /** 描述 */
    private String message;

    private HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private static HttpStatus instance(int code, String message) {
        return new HttpStatus(code, message);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
