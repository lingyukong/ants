package com.kly.ants.thinking_in_java.thread_14.example2;

/**
 * <p>Description:
 * 1: 创建一个线程，最简单的方法就是从Thread类继承
 * 2：thread 包含了一个特殊的方法，叫作 start()，它的作用是对线程进行特殊的初始化，然后调用 run()
 * 3：线程并不是按它们创建时的顺序运行的。事实上，CPU处理一个现有线程集的顺序是不确定的——
      除非我们亲自介入，并用Thread 的setPriority()方法调整它们的优先级
 * </p>
 *
 * @author kly
 * @Date 2018/1/27 16:56
 * @see
 */
public class SimpleThread extends Thread {
    private int countDown = 5;
    private int threadNumber;
    private static int threadCount = 0;


    public SimpleThread() {
        threadNumber = ++threadCount;
        System.out.println("Making--" + threadNumber);
    }

    public void run() {
        while(true) {
            System.out.println("Thread" + threadNumber + "(" + countDown + ")");
            if (--countDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread().start();
        }
        System.out.println("All Threads Started");
    }
}
