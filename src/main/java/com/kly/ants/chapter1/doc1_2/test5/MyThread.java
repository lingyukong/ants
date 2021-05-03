package com.kly.ants.chapter1.doc1_2.test5;

public class MyThread extends Thread{
    private int count=5;
    public MyThread() {

    }
    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while(count > 0) {
            count--;
            System.out.println("由"+ this.currentThread().getName() + "计算的,count=" + count);
        }
    }
}
