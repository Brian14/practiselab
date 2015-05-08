package regex.testregex;

import org.junit.Test;

/**
 * User: BAOBR
 * Date: 4/3/15
 */
public class TestStringReplace {

    @Test
    public void testReplace1() {
        String source = "xxxd";

        String result = source.replace("x", "7u");
        System.out.println(result);
    }


}
