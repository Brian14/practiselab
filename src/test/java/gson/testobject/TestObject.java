package gson.testobject;

/**
 * User: BAOBR
 * Date: 6/8/2015
 */
public class TestObject {
    private String testStr = "abc";
    private int a = 1;
    private transient int b = 2;
    public transient String notSerString = "should not be serialized";

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getNotSerString() {
        return notSerString;
    }

    public void setNotSerString(String notSerString) {
        this.notSerString = notSerString;
    }

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }
}
