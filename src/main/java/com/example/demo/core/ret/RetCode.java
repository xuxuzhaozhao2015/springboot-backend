package com.example.demo.core.ret;

public enum RetCode {
    SUCCESS(0, "成功"),
    FAIL(400, "失败"),
    UNAUTHORIZED(401, "未授权");

    private int code;
    private String desc;

    public int getCode(){
        return this.code;
    }

    RetCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
