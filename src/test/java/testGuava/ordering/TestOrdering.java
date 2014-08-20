package testGuava.ordering;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.List;

/**
 * User: BAOBR
 * Date: 8/20/14
 */
public class TestOrdering {
    @Test
    public void testNature() {
        String s1 = "123";
        String s2 = "ss";
        String s3 = "rrrr";



        List<String> stringList = Lists.newArrayList(s1, s2, s3);

        Collections.sort
        Ordering<String>.from (Ordering.natural());

    }

}
