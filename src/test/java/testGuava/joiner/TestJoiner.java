package testGuava.joiner;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * User: bao
 * Date: 2014/8/21
 */
public class TestJoiner {

    /**
     * 使用Skip null跳过null元素
     */
    @Test
    public void testSkipNull() {
        Joiner skipNullJoiner = Joiner.on("#").skipNulls();

        //去除null元素
        List<String> stringList1 = Lists.newArrayList("qqq", "www", "eee");
        //以list作为入参
        String result1 = skipNullJoiner.join(stringList1);

        System.out.println("result1:" + result1);


        List<String> stringList2 = Lists.newArrayList(null, "qqq", "www", null, "eee");
        String result2 = skipNullJoiner.join(stringList2);
        System.out.println("result2:" + result2);
    }

    @Test
    public void testArray() {
        Joiner arrayJoiner = Joiner.on("#").skipNulls();
        //以数组作为参数
        String a[] = {"1", "2", "3", "4", "sss", null, "ttt"};
        String arrayResult = arrayJoiner.join(a);

        System.out.println(arrayResult);


        //以map作为参数
        Map<String, Integer> map = Maps.newLinkedHashMap();
        map.put("S1", 1);
        map.put("T2", 2);
        map.put("W3", 3);

        //以entry
        String mapResult1 = arrayJoiner.join(map.entrySet());
        System.out.println(mapResult1);

        //以key set
        String mapResult2 = arrayJoiner.join(map.keySet());
        System.out.println(mapResult2);

        //以value
        String mapResult3 = arrayJoiner.join(map.values());
        System.out.println(mapResult3);


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

    /**
     * 使用 use for null 指定遇到null时，用来占位的默认值
     */
    @Test
    public void testUseForNull() {
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
