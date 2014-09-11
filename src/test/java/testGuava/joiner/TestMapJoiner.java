package testGuava.joiner;

import com.google.common.base.Joiner;
import com.google.common.base.Joiner.MapJoiner;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

/**
 * User: BAOBR
 * Date: 9/11/14
 */
public class TestMapJoiner {

    @Test
    public void testMap() {
        Map<String, Integer> map = Maps.newHashMap();
        map.put("S1", 1);
        map.put("S2", 2);
        map.put("S3", 3);
        map.put(null, 4);
        map.put("S4", null);

        //mapjoiner不支持skipNulls
//        MapJoiner mapJoiner = Joiner.on("**").skipNulls()
//                .withKeyValueSeparator("==");

        //key或value里存在null值都会导致nullpointer
//        MapJoiner mapJoiner = Joiner.on("**").withKeyValueSeparator("==");

        //useForNull会替换key和value中的null值
        MapJoiner mapJoiner = Joiner.on("**").withKeyValueSeparator("==").useForNull("is null");

        String result = mapJoiner.join(map);
        System.out.println(result);

    }

}
