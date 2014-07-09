package com.course.demo.impl;

/**
 * User: BAOBR
 * Date: 7/9/14
 */
public class ResultFactory {
    public static Result createResult(boolean isSuccess, String message) {
        return new Result(isSuccess, message);
    }
}
