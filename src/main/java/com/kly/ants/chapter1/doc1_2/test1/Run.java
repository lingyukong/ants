package com.kly.ants.chapter1.doc1_2.test1;

/**
 * 测试了线程的随机性，CPU会随机的，不确定的方式调用线程中的run方法
 */
public class Run {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();
        System.out.println("运行结束");
    }
}
