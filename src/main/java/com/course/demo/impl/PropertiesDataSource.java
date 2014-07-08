package com.course.demo.impl;

import com.course.demo.api.DataSource;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * User: bao
 * Date: 2014/7/8
 */
public class PropertiesDataSource implements DataSource {

    List<UserData> userDataList = new ArrayList<UserData>();
    Map<String,UserData> userDataMap = new HashMap<String, UserData>();
    Properties prop = new Properties();

    public PropertiesDataSource() {
        loadFile();
    }

    private void loadFile() {
        InputStream in;
        try {
            in = new BufferedInputStream(new FileInputStream("test.properties"));
            this.prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        fillList(prop);
    }


    @Override
    public synchronized List<UserData> getUserDatas() {
        loadFile();
        return userDataList;
    }

    /**
     * 此处若重复是直接覆盖的。需要在前面判断
     * @param newUser
     * @return
     */
    @Override
    public synchronized boolean addUser(UserData newUser) {
        prop.setProperty(newUser.getUsername(), newUser.getPassword());
        try {
            persistUserDatas();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Map<String, UserData> getUserDataMap() {
        loadFile();
        return userDataMap;
    }

    public void persistUserDatas() throws IOException {
        OutputStream os;
        os = new BufferedOutputStream(new FileOutputStream("test.properties"));
        prop.store(os, "user data");

    }

    private List<UserData> fillList(Properties prop) {
        Set<String> nameSet = prop.stringPropertyNames();
        List<UserData> userDatas = new ArrayList<UserData>();
        Map<String,UserData> userDataMap1 =new HashMap<String, UserData>();
        for (String key : nameSet) {
            UserData tempUserData = UserDataFactory.getEmptyUserData();
            tempUserData.setUsername(key);
            tempUserData.setPassword(prop.getProperty(key));
            userDatas.add(tempUserData);
            userDataMap1.put(key,tempUserData);
        }
        this.userDataList = userDatas;
        this.userDataMap = userDataMap1;
        return userDatas;
    }
}
