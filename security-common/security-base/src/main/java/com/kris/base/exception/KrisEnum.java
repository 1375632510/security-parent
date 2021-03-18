package com.kris.base.exception;

import lombok.Getter;

/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Getter
public enum KrisEnum {
    /**
     *
     */
    IO_EXCEPTION(511, "IO读取失败！");

    private final Integer code;

    private final String msg;

    private KrisEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
