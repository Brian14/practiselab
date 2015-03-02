package importnewtest.test0302;

/**
 * User: BAOBR
 * Date: 3/2/15
 */
public class TestAnonymousArray {

    public static void main(String[] args) {

        System.out.println("first total of numbers:" + sum(new int[]{1, 3, 4, 5}));
        System.out.println("second total of numbers:" + sum(new int[]{3, 4, 56, 7}));
    }

    public static int sum(int[] numbers) {
        int total = 0;
        for (int i : numbers) {
            total += i;
        }
        return total;
    }


}
