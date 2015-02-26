package testMickito.beginer;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

/**
 * User: bao
 * Date: 2015/2/26
 */
public class SimpleMockitoTest2 {

    @Test
    public void test1(){
        List mockArrayList = mock(ArrayList.class);

//        when(mockArrayList.get(0)).thenReturn("first");

        mockArrayList.add("one");
        verify(mockArrayList).add("one");





    }



}
