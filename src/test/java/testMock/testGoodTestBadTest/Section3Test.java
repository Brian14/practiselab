package testMock.testGoodTestBadTest;

import org.junit.Test;

/**
 * User: BAOBR
 * Date: 2/15/15
 */
public class Section3Test {
    @Test
    public void test() {
        int a = 1;
        int b = 2;
        b = -a;
        System.out.println("a=" + a + ",b=" + b);

    }
}
