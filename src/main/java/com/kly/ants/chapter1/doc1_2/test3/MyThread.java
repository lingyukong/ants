package com.kly.ants.chapter1.doc1_2.test3;


public class MyThread extends Thread{
    private int i;

    public MyThread(int i) {
        try {
            Thread.sleep(5000 * 60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
