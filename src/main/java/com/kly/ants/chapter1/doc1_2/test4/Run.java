package com.kly.ants.chapter1.doc1_2.test4;

/**
 * 实现一个线程还可以通过实现Runnable接口，连Thread类也是实现了Runnable方法的
 * 使用继承的设计方式是有局限性的，java是单根继承。可以使用实现Runnable接口的方式实现多线程
 */
public class Run {
    public static void main(String[] args) {
        MyRunnable myRun = new MyRunnable();
        Thread myThread = new Thread(myRun);//还可以传入Thread类
        myThread.start();
        System.out.println("Run end end ......");
    }


}
