package com.kly.ants.chapter1.doc1_2.test6;

public class MyThread extends Thread{
    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("由" + this.currentThread().getName()+"计算" + count);
    }


}
