package gson.testobject;

/**
 * User: BAOBR
 * Date: 6/8/2015
 */
public class TestInnerObject {

    private String aStr = "abc";

    public void test() {

        Runnable runnable = new Runnable() {
            String runString = "anonymous string";

            @Override
            public void run() {
                System.out.println(runString);
            }
        };

        Thread t = new Thread(runnable);
        t.start();
    }

    public class Inner {
        String innerStr = "Inner";
    }

}
