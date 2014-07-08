package com.course.demo.impl;

import com.course.demo.api.DataSource;

/**
 * User: bao
 * Date: 2014/7/8
 */
public class DataSourceFactory {

    private static final PropertiesDataSource propertiesDataSource = new PropertiesDataSource();

    public static DataSource getPropertiesDataSource(){
        return propertiesDataSource;
    }
}
