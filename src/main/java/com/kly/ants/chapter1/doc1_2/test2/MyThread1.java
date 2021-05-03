package com.kly.ants.chapter1.doc1_2.test2;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i=0;i<10 ;i++){
            int time = (int)(Math.random()*1000);
            try {
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
