package testGuava.joiner;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * User: BAOBR
 * Date: 9/11/14
 */
public class TestJoinerForStringBuilder {

    @Test
    public void testAppend() {
        StringBuilder stringBuilder = new StringBuilder("original***");

        Joiner sbJoiner = Joiner.on("#").skipNulls();

        List<String> stringList = Lists.newArrayList("111", "222", "333");

        StringBuilder result = sbJoiner.appendTo(stringBuilder, stringList);

        System.out.println(result.toString());

        System.out.println(result==stringBuilder);

    }



    @Test
    public void testAppend2() {
        StringBuilder stringBuilder = new StringBuilder("original***");

        Joiner sbJoiner = Joiner.on("#").skipNulls();

        List<String> stringList = Lists.newArrayList("111", "222", "333");

        sbJoiner.appendTo(stringBuilder, stringList);

        System.out.println(stringBuilder.toString());

    }



}
