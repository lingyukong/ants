package com.kly.ants.chapter1.doc1_5.test1;

/**
 * sleep();让当前正在执行的线程休眠，当前线程指的是this.currentThread()返回的线程
 * getId():获得线程的唯一标识
 */
public class MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println("run threadname=" + this.currentThread().getName() + " begin");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run threadname=" + this.currentThread().getName() + " end");
    }
}
