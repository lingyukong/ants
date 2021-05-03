package com.kly.ants.chapter1.doc1_3.test3;

public class CountOperate extends Thread{
    public CountOperate() {
        System.out.println("CountOperate----begin");
        System.out.println("CountOperate Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("CountOperate this.getName()=" + this.getName());
        System.out.println("CountOperate----end");

    }

    @Override
    public void run() {
        System.out.println("run-----begin");
        System.out.println("run Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("run this.getName()=" + this.getName());
        System.out.println("run ----end");
    }
}
