package com.kly.ants.chapter1.doc1_3.test2;

public class MyThread extends Thread {

    public MyThread() {
        System.out.println("构造方法：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }
}
