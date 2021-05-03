package com.kly.ants.chapter1.doc1_2.test2;

/**
 * start 方法 是告诉“线程规划器” 此线程已准备就绪，可以随时调用run方法，达到异步效果，可以继续执行main
 * 方法
 */
public class Run {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.setName("mythread");
        thread1.start();
        for (int i=0;i<10;i++) {
            int time= (int)(Math.random()*1000);
            try {
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
