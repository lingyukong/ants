package com.kly.ants.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/22 12:02
 */
public class Test3Thread implements Callable {
    private static int i ;
    @Override
    public Object call() throws Exception {
        i++;
        System.out.println(Thread.currentThread().getName() + ":" +i);
        return i;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个Callable
        for (int i=0;i<10;i++) {
            Test3Thread callable = new Test3Thread();
            FutureTask task = new FutureTask(callable);
            Thread testThread = new Thread(task);
            testThread.start();
            System.out.println(task.get());
        }
    }
}
