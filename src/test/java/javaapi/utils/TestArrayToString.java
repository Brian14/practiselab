package javaapi.utils;

import org.junit.Test;

import java.util.Arrays;

/**
 * User: BAOBR
 * Date: 4/20/15
 */
public class TestArrayToString {

    @Test
    public void test() {
        int a[] = {1, 2, 3, 4, 5, 6};

        System.out.println(a);
        System.out.println(Arrays.toString(a));

        byte[] b = new String("test1234567").getBytes();
        System.out.println(b);
        System.out.println(Arrays.toString(b));

    }
}
