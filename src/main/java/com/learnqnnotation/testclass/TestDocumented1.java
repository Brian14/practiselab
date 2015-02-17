package com.learnqnnotation.testclass;

import com.learnqnnotation.annotation.DocumentedTest;

/**
 * User: BAOBR
 * Date: 2/17/15
 */
public class TestDocumented1 {
    @DocumentedTest(hello = "e")
    public void test(){
        System.out.println("test1");
    }
}
