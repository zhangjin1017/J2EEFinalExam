package com.zj.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理
 */

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public RestBean doException(Exception exception){
        exception.printStackTrace();
        return new RestBean(1017,"服务器异常，请稍后再试！");
    }
}
