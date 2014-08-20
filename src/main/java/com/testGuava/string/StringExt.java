package com.testGuava.string;

import com.google.common.base.Splitter;

import java.util.Iterator;

/**
 * User: bao
 * Date: 2014/8/7
 */
public class StringExt {
    public static void main(String[] args) {
        String blNos = "12\rss\r333\r\r";
        Splitter splitter = Splitter.on("\r").omitEmptyStrings();
        Iterable<String> blNolist = splitter.split(blNos);
        Iterator<String> iterator = blNolist.iterator();
//        String d = iterator.next();
//        System.out.println(d);

        int i = 0;
        while (iterator.hasNext()) {
            System.out.println(i + ":" + iterator.next());
            i++;
        }


//        if (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        if (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
