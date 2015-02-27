package testMickito.beginer;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;

/**
 * User: BAOBR
 * Date: 2/26/15
 */
public class SimpleMockitoTest {

    /**
     * verify interactions of mock object
     */
    @Test
    public void test1() {
        List mockedList = mock(List.class);

        //use mock object
        mockedList.add("one");
        mockedList.clear();

        //verify
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }



    @Test
    public void test2(){
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        when(mockedList.get(0)).thenReturn("first");

        // the following prints "first"
        System.out.println(mockedList.get(0));

        // the following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));
    }



}
