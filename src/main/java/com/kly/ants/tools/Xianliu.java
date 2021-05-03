package com.kly.ants.tools;

import com.google.common.util.concurrent.RateLimiter;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/5/11 17:55
 */
public class Xianliu {
    private static RateLimiter rateLimiter = RateLimiter.create(10);

    public static void limit() throws InterruptedException {

//        Thread.sleep(5000);
//        System.out.println(rateLimiter.tryAcquire(1));
        if (rateLimiter.tryAcquire()) {
            System.out.println(Thread.currentThread() + "-" + "paas");
        } else {
            System.out.println(Thread.currentThread() + "-" + "wait");
        }
    }

    static class Test implements Runnable {

        public void run() {
            try {
                limit();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Test());
            Thread.sleep(1000);
            thread.start();
        }

        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(new Test());
            thread.start();
        }
    }
}
