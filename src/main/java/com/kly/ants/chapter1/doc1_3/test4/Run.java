package com.kly.ants.chapter1.doc1_3.test4;
/**
 * isAlive() 判断当前线程是否处于活动状态
 */
public class Run {
    public static void main(String[] args) {
        CountOperate count = new CountOperate();
        /**
         CountOperate----begin
         CountOperate Thread.currentThread().getName()=main
         CountOperate this.getName()=Thread-0
         CountOperate Thread.currentThread().isAlive()=true
         CountOperate this.isAlive()false
         CountOperate----end
         run-----begin
         run Thread.currentThread().getName()=Thread-0
         run Thread.currentThread().getName()=true
         run this.getName()=Thread-0
         run this.isAlive()=true
         run ----end
         */
//        count.start();


        /**
         CountOperate----begin
         CountOperate Thread.currentThread().getName()=main
         CountOperate this.getName()=Thread-0
         CountOperate Thread.currentThread().isAlive()=true
         CountOperate this.isAlive()false
         CountOperate----end
         main begin t1 is alive=false
         main end t1 is alive=true
         run-----begin
         run Thread.currentThread().getName()=A
         run Thread.currentThread().isAlive()true
         run this.getName()=Thread-0
         run this.isAlive()=false      ？？？？ 这个不懂啊，为什么是false
         run ----end
         */
        Thread t1 = new Thread(count);
        System.out.println("main begin t1 is alive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 is alive=" + t1.isAlive());

    }
}
