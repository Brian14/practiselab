package testGuava.basicutils.charmatcher;

import com.google.common.base.CharMatcher;
import org.junit.Test;

/**
 * User: BAOBR
 * Date: 10/11/14
 */
public class TestCharMatcher {

    @Test
    public void testCharMatcher1() {
        String original = "qweasdzxczaqwsxcde";

        CharMatcher matcher1 = CharMatcher.is('s');
        CharMatcher matcher2 = CharMatcher.is('q');

        CharMatcher matcher3 = matcher1.or(matcher2);

        System.out.println(matcher3.countIn(original));
    }


    @Test
    public void testCharMatcher2() {
        String original = "1234567890qwertyu1234567890";

        CharMatcher charMatcher1 = CharMatcher.JAVA_DIGIT;

        System.out.println("remove matched char: " + charMatcher1.removeFrom(original));
        System.out.println("retain matched char: " + charMatcher1.retainFrom(original));

        System.out.println("replace matched char: "+ charMatcher1.collapseFrom(original,'#'));
        System.out.println("replace matched char: "+ charMatcher1.replaceFrom(original,"#$%^"));

    }


}
