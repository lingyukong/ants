package com.kly.ants.chapter1.doc1_5.test2;

public class Run {
    public static void main(String[] args) {
        Mythread1 thread = new Mythread1();
        System.out.println(System.currentTimeMillis());
        thread.start();
        System.out.println(System.currentTimeMillis());
    }
}
