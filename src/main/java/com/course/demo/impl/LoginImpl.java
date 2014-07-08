package com.course.demo.impl;

import com.course.demo.api.DataSource;
import com.course.demo.api.Login;

import java.util.List;
import java.util.Map;

/**
 * User: bao
 * Date: 2014/7/8
 */
public class LoginImpl implements Login {
    DataSource dataSource = DataSourceFactory.getPropertiesDataSource();

    @Override
    public Result login(String username, String password) {

        Map<String,UserData> userDataMap = dataSource.getUserDataMap();
        UserData toLogin = UserDataFactory.getEmptyUserData();
        toLogin.setUsername(username);
        toLogin.setPassword(password);

        if(!userDataMap.containsKey(username)){
            return new Result(false,"user is not exits, register first");
        }
        if(!userDataMap.get(username).getPassword().equals(password)){
            return new Result(false,"wrong password.");
        }
        return new Result(true,"login success");
    }

    @Override
    public Result register(String username, String password) {
        return null;
    }

}
