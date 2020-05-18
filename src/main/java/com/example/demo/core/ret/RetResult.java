package com.example.demo.core.ret;

import lombok.Data;

@Data
public class RetResult<T> {
    private int code;
    private String msg;
    private T data;

    public RetResult<T> setCode(RetCode code) {
        this.code = code.getCode();
        return this;
    }

    public RetResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public RetResult<T> setData(T data) {
        this.data = data;
        return this;
    }
}
