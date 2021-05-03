package com.kly.ants.thread.test;

/**
 * Description:
 * Company:changyou
 * 伪共享测试
 *
 * @author konglingyu
 * @Date 2020/3/11 22:51
 */
public class FalseSharingTest {

    static class Pointer {
        volatile long x;
        volatile long y;
    }


    public static void main(String[] args) throws InterruptedException {
        testPointer(new Pointer());
    }

    private static void testPointer(Pointer pointer) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                pointer.x++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                pointer.y++;
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




