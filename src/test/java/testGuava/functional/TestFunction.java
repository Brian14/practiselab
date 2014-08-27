package testGuava.functional;

import com.google.common.base.Function;
import com.sun.istack.internal.Nullable;
import org.junit.Test;

/**
 * User: BAOBR
 * Date: 8/27/14
 */
public class TestFunction {
    @Test
    public void testFunction1() {

        Function<Integer, String> changefunction = new Function<Integer, String>() {
            @Override
            public String apply(@Nullable Integer input) {
                return new StringBuilder(input.toString()).append(" int").toString();

            }
        };

        String test = changefunction.apply(132);
        System.out.println(test);


    }

}
