package com.course.demo.impl;

/**
 * User: bao
 * Date: 2014/7/8
 */
public class Result {

    boolean isSuccess;

    String message;

    public Result(boolean success, String message) {
        isSuccess = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
