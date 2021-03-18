package com.kris.base.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Author: chenyu
 * @Date: 2021/3/17
 */
@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KrisException extends RuntimeException {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 错误信息
     */
    private String msg;

    public KrisException(KrisEnum krisEnum) {
        this(krisEnum.getCode(), krisEnum.getMsg());
    }
}
