package corejava.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * User: BAOBR
 * Date: 10/27/14
 */
public class TestString {

    @Test
    public void test1(){
        String s1 = null;
        String s2 = null;

        System.out.println(StringUtils.equals(s1,"1"));
        System.out.println(StringUtils.equals("1",null));
        System.out.println(StringUtils.equals(null,null));


    }

}
