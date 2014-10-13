package testGuava.basicutils.strings;

import static com.google.common.base.Strings.emptyToNull;
import static com.google.common.base.Strings.isNullOrEmpty;
import static com.google.common.base.Strings.nullToEmpty;
import static com.google.common.base.Strings.padStart;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * User: BAOBR
 * Date: 9/11/14
 */
public class TestStrings {
    @Test
    public void testNullToEmpty() {
        //null to empty
        String string1 = null;
        String result1 = nullToEmpty(string1);

        assertTrue(result1.isEmpty());

        String string2 = "test";
        String result2 = nullToEmpty(string2);
        assertTrue(result2.equals(string2));
    }

    @Test
    public void testEmptyToNull() {
        //empty to null
        String string1 = "";
        String result1 = emptyToNull(string1);
        assertTrue(result1 == null);

        String string2 = "test";
        String result2 = emptyToNull(string2);
        assertTrue(result2.equals(string2));

        //empty to null 也接收null 为入参，返回值是null
        String string3 = null;
        String result3 = emptyToNull(string3);
        assertTrue(result3 == null);
    }

    @Test
    public void testIsNullOrEmpty() {
        //is null or empty
        String string1 = "";
        boolean result1 = isNullOrEmpty(string1);
        assertTrue(result1);

        String string2 = null;
        boolean result2 = isNullOrEmpty(string2);
        assertTrue(result2);

        String string3 = "test";
        boolean result3 = isNullOrEmpty(string3);
        assertFalse(result3);
    }

    @Test
    public void testPadStart() {
        String original1 = "sss";
        String original2 = "";
        String original3 = "123456789";
//        String original4 = null;

        String result1 = padStart(original1, 8, '*');
        String result2 = padStart(original2, 8, '*');
        String result3 = padStart(original3, 8, '*');
        //不会处理null的情况
//        String result4 = padStart(original4, 8, '*');

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }


    /**
     *
     *  padEnd
     *  repeat
     *  commonPrefix
     *  commonSuffix
     *  validSurrogatePairAt
     */
}
