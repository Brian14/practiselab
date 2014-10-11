package testGuava.precondiction;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkElementIndex;
import static com.google.common.base.Preconditions.checkNotNull;
import org.junit.Test;

/**
 * User: bao
 * Date: 2014/10/11
 */
public class TestPrecondiction {
    @Test
    public void testCheckNotNull() {
        String test = null;
        checkNotNull(test, "object test is null");
    }

    @Test
    public void testCheckArgument() {
        boolean condition = false;
        checkArgument(condition, "condition should been true");
    }

    @Test
    public void testCheckState() {
        boolean state = false;
        checkArgument(state, "state should been true");
    }

    /**
     * index should not be negative
     */
    @Test
    public void testCheckElementIndex1() {
        int index = -1;
        int size = 2;
        checkElementIndex(index, size, "index should within size");
    }

    @Test
    public void testCheckElementIndex2() {
        int index = 3;
        int size = 2;
        checkElementIndex(index, size, "index should within size");
    }


}
