package corejava;

import org.junit.Test;

/**
 * User: BAOBR
 * Date: 8/28/14
 */
public class StringUtils {
    @Test
    public void testReplace(){
        String source = "MT:22::2";

        String target = source.replaceFirst(":","");
        System.out.println(target);

    }

}
