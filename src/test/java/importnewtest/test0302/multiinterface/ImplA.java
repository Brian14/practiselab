package importnewtest.test0302.multiinterface;

/**
 * User: BAOBR
 * Date: 3/2/15
 */
public class ImplA implements InterfaceA, InterfaceB {

    public static void main(String[] args) {
        //多接口里有同名变量的话会报编译错的
//        System.out.println(ImplA.test);
    }
}
