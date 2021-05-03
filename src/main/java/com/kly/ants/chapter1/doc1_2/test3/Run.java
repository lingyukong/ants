package com.kly.ants.chapter1.doc1_2.test3;

/**
 * start方法的调用的顺序，不代表线程启动的顺序
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);
        MyThread t4 = new MyThread(4);
        MyThread t5 = new MyThread(5);
        MyThread t6 = new MyThread(6);
        MyThread t7 = new MyThread(7);
        MyThread t8 = new MyThread(8);
        MyThread t9 = new MyThread(9);
        MyThread t10 = new MyThread(10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        try {
            t1.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
