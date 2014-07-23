package com.corejava.hehe2;

import java.util.ArrayList;

/**
 * User: BAOBR
 * Date: 7/11/14
 */
public class TestMain {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = null;

        for (String s : list) {
            System.out.println(s.toCharArray());
        }

//        for(String s:list1){
//            System.out.println(s.toCharArray());
//        }

    }
}
