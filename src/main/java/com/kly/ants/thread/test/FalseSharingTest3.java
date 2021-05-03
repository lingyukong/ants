package com.kly.ants.thread.test;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/11 22:56
 */
public class FalseSharingTest3 {
    static class Pointer {
        MyLong x = new MyLong();
        MyLong y = new MyLong();
    }

    static class MyLong {
        volatile long value;
        long p1, p2, p3, p4, p5, p6, p7;
    }

    public static void main(String[] args) throws InterruptedException {
        testPointer(new Pointer());
    }

    private static void testPointer(Pointer pointer) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                pointer.x.value++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                pointer.y.value++;
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(System.currentTimeMillis() - start);
        System.out.println(pointer);
    }

}
