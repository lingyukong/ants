package com.kly.ants.chapter1.doc1_2.test5;

/**
 * 线程间不共享数据的情况
 */
public class Run {
    public static void main(String[] args) {
          //线程安全的访问
//        MyThread threadA = new MyThread("A");
//        MyThread threadB = new MyThread("B");
//        MyThread threadC = new MyThread("C");
//        threadA.start();
//        threadB.start();
//        threadC.start();

        //线程不安全的访问
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
