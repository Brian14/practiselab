package javaapi.javaprime;

import org.junit.Test;

/**
 * User: BAOBR
 * Date: 4/20/15
 */
public class TestIntLong {

    @Test
    public void test() {
        int a = 3;
        long b = a * 60 * 60 * 1000;

        System.out.println(b);

        long c = (long) a * 60 * 60 * 1000;
        System.out.println(c);


    }


}
