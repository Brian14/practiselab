package testGuava.collections.Lists;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * User: BAOBR
 * Date: 10/15/14
 */
public class TestLists {
    @Test
    public void testLists1() {

        List<String> list1 = Lists.newArrayList();
        list1.add("first");
        list1.add("second");
        list1.add("third");
        list1.add("fourth");

        String array1[] = {"a1", "a2", "a3", "a4"};


        for (String s : list1) {
            System.out.println(s);
        }

        System.out.println("-------end first---------");

        //make list from array
        List<String> list2 = Lists.asList("pre", array1);
        for (String s : list2) {
            System.out.println(s);
        }


    }


    @Test
    public void testPartition() {
        List<String> li = Lists.newArrayList();
        for (int i = 0; i < 20; i++) {
            li.add((new StringBuilder("content" + i)).toString());
        }

        List<List<String>> lili = Lists.partition(li, 6);
        System.out.println(lili);




    }


}
