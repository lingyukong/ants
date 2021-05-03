package com.kly.ants.chapter1.doc1_2.test1;

public class MyThread extends Thread{

    @Override
    public void run(){
//        super.run();//？？？super表示父类对象，调用父类的run方法，可是为什么要调用父类的run方法啊
        System.out.println("MyThread");
    }

}
