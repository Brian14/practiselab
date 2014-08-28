package testGuava.functional;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Maps;
import com.sun.istack.internal.Nullable;
import org.junit.Test;

import java.util.Map;

/**
 * User: BAOBR
 * Date: 8/27/14
 */
public class TestFunction {

    //function instance
    Function<Integer, String> intToString = new Function<Integer, String>() {
        @Override
        public String apply(@Nullable Integer input) {
            return new StringBuilder(input.toString()).append(" int").toString();

        }
    };

    @Test
    public void testFunction1() {

        //use function.apply
        String test = intToString.apply(132);
        System.out.println(test);

    }


    @Test
    public void testForMaps() {
        Map<Integer, String> testmap = Maps.newHashMap();
        testmap.put(111, "String111");
        testmap.put(222, "String222");
        testmap.put(333, "String333");

        Map<Integer, String> testmap2 = Maps.newHashMap();

        Function<Integer, String> lookup1 = Functions.forMap(testmap);
        System.out.println(lookup1.toString());
        String get = lookup1.apply(222);
        System.out.println(get);


        Function<Integer, String> lookup2 = Functions.forMap(testmap,"default");
        System.out.println(lookup2.toString());
        testmap.put(444, "String444");


        String get2 = lookup2.apply(444);
        System.out.println(get2);
        String get3 = lookup2.apply(555);
        System.out.println(get3);




    }
//    @Test
//    public void testFunction2() {
//        Function<>
//    }


}
