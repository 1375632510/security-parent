package com.kris.base.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: chenyu
 * @Date: 2021/3/17
 */
@Data
public class R<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;

    private R(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> R<T> success(Integer code, String msg, T data) {
        return new R<T>(code, msg, data);
    }

    public static <T> R<T> success(Integer code, String msg) {
        return success(code, msg, null);
    }

    public static <T> R<T> success(String msg, T data) {
        return success(200, msg, data);
    }

    public static <T> R<T> success(String msg) {
        return success(msg, null);
    }

    public static <T> R<T> error(Integer code, String msg, T data) {
        return new R<T>(code, msg, data);
    }

    public static <T> R<T> error(Integer code, String msg) {
        return new R<T>(code, msg, null);
    }

    public static <T> R<T> error(String msg, T data) {
        return error(501, msg, data);
    }

    public static <T> R<T> error(String msg) {
        return error(msg, null);
    }
}
