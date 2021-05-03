package com.kly.ants.chapter1.doc1_3.test2;

public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        /**
         * 构造方法：main
           run方法的打印：Thread-0（告诉CPU此线程已经就绪，可以随时被调用）
         */
//        thread.start();

        /**
         * 构造方法：main
           run方法的打印：main  (相当于调用了对象的一个方法而已)
         */
        thread.run();
    }
}
