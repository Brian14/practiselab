package com.corejava.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * User: bao
 * Date: 2014/6/12
 */
public class TestDecimal {

    public static void main(String args[]){
        BigDecimal b= new BigDecimal(100.224);
        DecimalFormat format = new DecimalFormat(".00");
        String s = format.format(b);
        System.out.println(s);

        BigDecimal b2= new BigDecimal(100);
        DecimalFormat format2 = new DecimalFormat(".00");
        String s2 = format.format(b2);
        System.out.println(s2);

    }
}
