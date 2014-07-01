package com.corejava.date;

import java.util.TimeZone;

/**
 * User: BAOBR
 * Date: 7/1/14
 */
public class TestTimeZone {

    public static void main(String args[]){
       TimeZone tz = null;
        tz = TimeZone.getDefault();
        System.out.println(tz.toString());

    }
}
