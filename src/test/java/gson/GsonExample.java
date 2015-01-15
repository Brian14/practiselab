package gson;

import com.google.gson.Gson;
import org.junit.Test;

/**
 * User: BAOBR
 * Date: 1/13/15
 */
public class GsonExample {

    /**
     * 序列化
     */
    @Test
    public void testPrimitivesSerialization() {

        Gson testGson = new Gson();

        //int
        String str1 = testGson.toJson(1);
        System.out.println(str1);

        //string
        String str2 = testGson.toJson("abcd");
        System.out.println(str2);

        //Long object
        String str3 = testGson.toJson(new Long(10));
        System.out.println(str3);

        //array1
        int[] array1 = {1};
        String str4 = testGson.toJson(array1);
        System.out.println(str4);

        //array2
        int[] array2 = {1, 2, 3, 4};
        String str5 = testGson.toJson(array2);
        System.out.println(str5);
    }

    /**
     * 反序列化
     */
    @Test
    public void testPrimitivesDeserialization() {

        Gson testGson = new Gson();

        //same value, different target type
        //int
        int int1 = testGson.fromJson("1", int.class);
        System.out.println(int1);

        //Integer
        Integer integer1 = testGson.fromJson("1", Integer.class);
        System.out.println(integer1);
        System.out.println(integer1.getClass());

        //Long
        Long long1 = testGson.fromJson("1", Long.class);
        System.out.println(long1);
        System.out.println(long1.getClass());

        //wrong
//        Boolean boolean1 = testGson.fromJson("1",Boolean.class);
//        System.out.println(boolean1);

        String str1 = testGson. fromJson("\"abc\"", String. class);
        System.out.println(str1);

//        String str2 = testGson.fromJson("[\"abc\", \"abcd\"]", [] );
//        System.out.println(str2);

    }

    /**
     *
     */



}
