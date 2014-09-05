package testGuava.splitter;

import com.google.common.base.Splitter;
import org.junit.Test;

/**
 * User: bao
 * Date: 2014/8/21
 */
public class TestSplitter {
    @Test
    public void testSplit() {

        String s = "1;2;2;3;3;;4;5;     ;ss;";
        Splitter blNoSplitter = Splitter.on(";").trimResults().omitEmptyStrings();

        Iterable<String> iterable = blNoSplitter.split(s);
        System.out.println(iterable);

    }

}
