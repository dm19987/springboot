package com.qianfeng.mybatis.handler;

import com.qianfeng.mybatis.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handlerException(Exception exception){
        exception.printStackTrace();
        return  new ResultBean("404","您的操作有误！！");
    }
}
