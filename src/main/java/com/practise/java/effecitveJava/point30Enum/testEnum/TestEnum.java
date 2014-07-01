package com.practise.java.effecitveJava.point30Enum.testEnum;

/**
 * User: BAOBR
 * Date: 6/11/14
 */
public class TestEnum {
    public enum Orange{
        Temple,Blood,Navel
    };

    public static void main(String args[]){
        System.out.println(Orange.Blood);
        System.out.println(Orange.Blood.ordinal());
        System.out.println(Orange.Blood.getDeclaringClass());
    }
}
