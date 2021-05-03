package com.kly.ants.chapter1.doc1_5.test2;

public class Mythread1 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run threadname=" + this.currentThread().getName() + " begin=" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadname=" + this.currentThread().getName() + " end=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
