package com.example.demo.core.ret;

public class RetResponse {
    private final static String SUCCESS = "SUCCESS";
    private final static String FAIL = "FAIL";

    public static <T> RetResult<T> Success() {
        RetResult<T> result = new RetResult<>();
        return result.setCode(RetCode.SUCCESS).setMsg(SUCCESS);
    }

    public static <T> RetResult<T> Success(T data) {
        RetResult<T> result = new RetResult<>();
        return result.setCode(RetCode.SUCCESS).setMsg(SUCCESS).setData(data);
    }

    public static <T> RetResult<T> Fail() {
        RetResult<T> result = new RetResult<>();
        return result.setCode(RetCode.FAIL).setMsg(FAIL);
    }

    public static <T> RetResult<T> Fail(Exception e) {
        RetResult<T> result = new RetResult<>();
        return result.setCode(RetCode.FAIL).setMsg("操作失败：" + e.getMessage());
    }
}
