package com.kly.ants.chapter1.doc1_3.test1;

/**
 * currentThread返回的是当前代码段被哪个线程调用的信息
 */
public class Run1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
