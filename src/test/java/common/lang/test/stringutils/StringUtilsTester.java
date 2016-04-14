package common.lang.test.stringutils;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.List;

/**
 * Created by bao on 2016/4/14.
 */
public class StringUtilsTester {
    @Test
    public void test1(){
        List<String> stringList = Lists.newArrayList();
        stringList.add("aas");
        stringList.add("bbb");
        String[] stringArray = {"11","eee"};

        System.out.println(StringUtils.isAnyEmpty(stringArray));
    }

}
