package testGuava.oocl.reproduce;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterators.filter;
import static com.google.common.collect.Iterators.transform;
import com.google.common.collect.Lists;
import com.sun.istack.internal.Nullable;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * User: BAOBR
 * Date: 10/27/14
 */
public class StikeCode {

    public static Function<String, String> getFunction(final String appender) {
        return new Function<String, String>() {
            @Override
            public String apply(@Nullable java.lang.String input) {
                return input + appender;
            }
        };
    }

    @Test
    public void main() {
        List<String> source = Lists.newArrayList("sss1", "sss2", "sss3");
        Predicate<String> mock = Predicates.alwaysFalse();


        Iterator<String> it = concat((transform(filter(source.iterator(), mock), getFunction("tttt")));

        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
        System.out.println("end");
    }
}
