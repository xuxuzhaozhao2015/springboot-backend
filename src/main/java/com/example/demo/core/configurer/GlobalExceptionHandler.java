package com.example.demo.core.configurer;

import com.example.demo.core.exception.ServiceException;
import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ServiceException.class)
    @ResponseBody
    public RetResult<?> serviceExceptionHandler(HttpServletRequest req, ServiceException e) {
        log.error("发生业务异常：" + e.getMessage());
        return RetResponse.Fail(e);
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public RetResult<?> exceptionHandler(HttpServletRequest req, Exception e) {
        log.error("发生一般异常：" + e.getMessage());
        return RetResponse.Fail(e);
    }
}
