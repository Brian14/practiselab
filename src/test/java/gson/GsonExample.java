package gson;

import com.google.gson.Gson;
import gson.testobject.TestInnerObject;
import gson.testobject.TestInnerObject.Inner;
import gson.testobject.TestObject;
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
        //1
        System.out.println(str1);

        //string
        String str2 = testGson.toJson("abcd");
        // "abcd"
        System.out.println(str2);

        //Long object
        String str3 = testGson.toJson(new Long(10));
        //10
        System.out.println(str3);

        //array1
        int[] array1 = {1};
        String str4 = testGson.toJson(array1);
        //[1]
        System.out.println(str4);

        //array2
        int[] array2 = {1, 2, 3, 4};
        String str5 = testGson.toJson(array2);
        //[1,2,3,4]
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

        String str1 = testGson.fromJson("\"abc\"", String.class);
        System.out.println(str1);

//        String str2 = testGson.fromJson("[\"abc\", \"abcd\"]", [] );
//        System.out.println(str2);

    }

    /**
     * 序列化对象
     */
    @Test
    public void testDealWithObject() {
        TestObject tb = new TestObject();
        Gson gson = new Gson();
        String tbString = gson.toJson(tb);

        //{"testStr":"abc","a":1}
        System.out.println(tbString);
    }

    /**
     * 反序列话对象
     */
    @Test
    public void testDealWithObject2() {
        String sourceJsonStr = "{\"testStr\":\"abc\",\"a\":1}";
        Gson gson = new Gson();
        TestObject tb = gson.fromJson(sourceJsonStr, TestObject.class);

        System.out.println(tb);

    }

    /**
     * 匿名内部类
     */
    @Test
    public void testInnerClass() {
        TestInnerObject outerObject = new TestInnerObject();
        Gson gson = new Gson();
        String result = gson.toJson(outerObject);

        System.out.println(result);
    }

    /**
     * array
     */
    @Test
    public void testArray() {
        String[] strings = {"aaa", "bbb", "vvvv"};
        int[] ints = {1, 2, 3};

        Gson gson = new Gson();

        String strJson = gson.toJson(strings);
        String intJson = gson.toJson(ints);

        System.out.println(strJson);
        System.out.println(intJson);

//        int[] anotherInts =
    }


}
