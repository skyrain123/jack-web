package com.framework.jack.demo.base;

/**
 * @author jack
 */
public class BaseResponse<T> {

    private int code;

    private T data;

    private BaseResponse(HttpStatus status) {
        this(status, (T) status.getMessage());
    }

    private BaseResponse(HttpStatus status, T data) {
        this.code = status.getCode();
        this.data = data;
    }

    public static BaseResponse body(HttpStatus status) {
        return new BaseResponse<>(status);
    }

    public static <T> BaseResponse ok(T data) {
        return new BaseResponse<>(HttpStatus.OK, data);
    }

    public static <T> BaseResponse error(T data) {
        return new BaseResponse<>(HttpStatus.ERROR, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
