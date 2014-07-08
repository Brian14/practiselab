package com.course.demo.api;

import com.course.demo.impl.Result;

/**
 * User: bao
 * Date: 2014/7/8
 */
public interface Login {

    public Result login(String username,String password);

    public Result register(String username,String password);
}
