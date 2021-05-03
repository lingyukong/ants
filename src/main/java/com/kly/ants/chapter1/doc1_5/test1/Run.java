package com.kly.ants.chapter1.doc1_5.test1;

public class Run {
    public static void main(String[] args) {
        MyThread1 mythread = new MyThread1();
        System.out.println("begin=" + System.currentTimeMillis());
        mythread.run();
        System.out.println("end" + System.currentTimeMillis());
    }
}
