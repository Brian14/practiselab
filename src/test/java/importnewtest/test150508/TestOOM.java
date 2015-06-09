package importnewtest.test150508;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * User: BAOBR
 * Date: 5/8/15
 */
public class TestOOM {

    public void testStackOverflow() {
        testStackOverflow();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        TestOOM o = new TestOOM();
//        o.testStackOverflow();
        while (true) {
            list.add(UUID.randomUUID().toString().intern());
        }
    }


}
