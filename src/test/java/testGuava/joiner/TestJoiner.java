package testGuava.joiner;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.List;

/**
 * User: bao
 * Date: 2014/8/21
 */
public class TestJoiner {

    @Test
    public void testSkipNull() {
        Joiner skipNullJoiner = Joiner.on("#").skipNulls();

        List<String> stringList1 = Lists.newArrayList("qqq", "www", "eee");
        String result1 = skipNullJoiner.join(stringList1);

        System.out.println("result1:" + result1);


        List<String> stringList2 = Lists.newArrayList(null, "qqq", "www", null, "eee");
        String result2 = skipNullJoiner.join(stringList2);
        System.out.println("result2:" + result2);
    }

    @Test
    public void testWithoutSkipNull() {
        //分隔符可以是任意字符串
        Joiner normalJoiner = Joiner.on("##$%");

        List<String> stringList1 = Lists.newArrayList("qqq", "www", "eee");
        String result1 = normalJoiner.join(stringList1);
        System.out.println("result1:" + result1);

        try {
            List<String> stringList2 = Lists.newArrayList(null, "qqq", "www", null, "eee");
            String result2 = normalJoiner.join(stringList2);
            System.out.println("result2:" + result2);
        } catch (NullPointerException e) {
            //should throw NPE
            assertTrue(true);
        }
    }

    @Test
    public void testImmutable() {
        Joiner normalJoiner = Joiner.on("#");
        String instance1 = normalJoiner.toString();
        System.out.println(instance1);

        //return another object
        normalJoiner = normalJoiner.skipNulls();
        String instance2 = normalJoiner.toString();
        System.out.println(instance2);

        //not the same object
        assertFalse(instance1.equals(instance2));
    }

    @Test
    public void testUseForNull(){
        //指定遇到null时的占位字符串
        Joiner useForNullJoiner = Joiner.on("#").useForNull("missing text");

        List<String> stringList1 = Lists.newArrayList("qqq", "www", "eee");
        String result1 = useForNullJoiner.join(stringList1);

        System.out.println("result1:" + result1);


        List<String> stringList2 = Lists.newArrayList(null, "qqq", "www", null, "eee");
        String result2 = useForNullJoiner.join(stringList2);
        System.out.println("result2:" + result2);
    }





}
