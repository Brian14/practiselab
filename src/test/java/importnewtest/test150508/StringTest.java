package importnewtest.test150508;

import org.junit.Test;

/**
 * User: BAOBR
 * Date: 5/8/15
 */
public class StringTest {

    @Test
    public void test1() {
        System.out.println(1 + 'a');
        System.out.println("" + 1 + 'a');

    }


    @Test
    public void test2(){
        String s1 = "123e3345e555e";

        System.out.println(s1.length());
        System.out.println(s1.indexOf('e',0));
        System.out.println(s1.indexOf('e',6));




    }
}
