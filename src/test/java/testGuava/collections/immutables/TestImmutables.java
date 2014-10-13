package testGuava.collections.immutables;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;

/**
 * User: BAOBR
 * Date: 10/13/14
 */
public class TestImmutables {
    @Test
    public void testImmutableList() {
        //这个builder的写法很奇怪啊
        List<String> immutableList = ImmutableList.<String>builder().add("123").add("ss").build();
        for (String s : immutableList) {
            System.out.println(s);
        }

        System.out.println(immutableList.contains("sss"));

    }

}
