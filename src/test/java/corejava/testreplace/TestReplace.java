package corejava.testreplace;

import org.junit.Test;

/**
 * User: BAOBR
 * Date: 3/31/15
 */
public class TestReplace {
    @Test
    public void test(){
        String test1 = "#~s##s~~ss^^w^w||w|w|~^#ss#^sdddeefffffef1234566";
        String test2= test1.replaceAll("[#~\\^\\|]*","");
        System.out.println(test2);

    }
}
