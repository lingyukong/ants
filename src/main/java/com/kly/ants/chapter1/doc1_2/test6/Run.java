package com.kly.ants.chapter1.doc1_2.test6;

/**
 * 本例引用了非线程安全的概念
 * 非线程安全：
 *              多个线程对同一个对象的同一个实例变量进行操作时值被更改，不同步的问题。进而影响程序的执行流程
 *  解决办法：
 *           增加synchronized关键字，上锁
 *           执行的时候会排队执行，只有拿到锁的才能执行，多个线程会同时争抢这把锁
 */
public class Run {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        Thread threadA = new Thread(mythread,"A");
        Thread threadB = new Thread(mythread,"B");
        Thread threadC = new Thread(mythread,"C");
        Thread threadD = new Thread(mythread,"D");
        Thread threadE = new Thread(mythread,"E");
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();
    }
}
