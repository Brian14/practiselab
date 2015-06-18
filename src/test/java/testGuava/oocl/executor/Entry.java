package testGuava.oocl.executor;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * User: BAOBR
 * Date: 6/18/2015
 */
public class Entry {

    @Test
    public void test() throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        List<TimeConsumingCallable> list1 = Lists.newArrayList();
        List<TimeConsumingCallable> list2 = Lists.newArrayList();
        List<TimeConsumingCallable> list3 = Lists.newArrayList();
        List<Future<Integer>> futureList = Lists.newArrayList();

        for (int i = 0; i < 20; i++) {
            TimeConsumingCallable callable = new TimeConsumingCallable(i);
            list1.add(callable);
        }

        for (int i = 30; i < 55; i++) {
            TimeConsumingCallable callable = new TimeConsumingCallable(i);
            list2.add(callable);
        }

        for (int i = 60; i < 80; i++) {
            TimeConsumingCallable callable = new TimeConsumingCallable(i);
            list3.add(callable);
        }



        futureList.addAll(service.invokeAll(list1));
        futureList.addAll(service.invokeAll(list2));
        futureList.addAll(service.invokeAll(list3));

        for (Future<Integer> future : futureList) {
            Integer num = future.get();
            System.out.println(num);
//            System.out.println("done");
        }

    }


}
