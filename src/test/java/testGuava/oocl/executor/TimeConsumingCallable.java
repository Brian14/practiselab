package testGuava.oocl.executor;

import java.util.concurrent.Callable;

/**
 * User: BAOBR
 * Date: 6/18/2015
 */
public class TimeConsumingCallable implements Callable<Integer> {
    private int number;

    public TimeConsumingCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 100000000L; i++) {
            i++;
        }
        return number * 2;
    }
}
