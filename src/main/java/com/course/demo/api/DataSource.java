package com.course.demo.api;

import com.course.demo.impl.UserData;

import java.util.List;
import java.util.Map;

/**
 * User: bao
 * Date: 2014/7/8
 */
public interface DataSource {

    public List<UserData> getUserDatas();

    public boolean addUser(UserData newUser);

    public Map<String,UserData> getUserDataMap();
}
