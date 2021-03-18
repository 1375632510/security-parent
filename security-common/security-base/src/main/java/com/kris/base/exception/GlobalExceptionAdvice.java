package com.kris.base.exception;

import com.kris.base.domain.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: chenyu
 * @Date: 2021/3/17
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    private final Logger log = LoggerFactory.getLogger(GlobalExceptionAdvice.class);

    @ExceptionHandler(KrisException.class)
    public R<?> error(KrisException e) {
        log.error(e.getMsg());
        e.printStackTrace();
        return R.error(e.getCode(), e.getMsg());
    }

    @ExceptionHandler(ArithmeticException.class)
    public R<?> error(ArithmeticException e) {
        log.error(e.getMessage());
        e.printStackTrace();
        return R.error(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public R<?> error(Exception e) {
        log.error(e.getMessage());
        e.printStackTrace();
        return R.error(e.getMessage());
    }
}
