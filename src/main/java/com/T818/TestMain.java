package com.T818;

/**
 * User: BAOBR
 * Date: 8/18/14
 */
public class TestMain {
    public static void main(String[] args) {
        ListWrapper listWrapper = null;
        listWrapper = new ListWrapper();
        if (listWrapper == null || listWrapper.list.isEmpty()) {
            System.out.println("22");
        }
    }
}
