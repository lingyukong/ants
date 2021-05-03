package com.kly.ants.chapter1.doc1_3.test3;

public class Run {
    public static void main(String[] args) {
        CountOperate count = new CountOperate();
        /**
         CountOperate----begin
         CountOperate Thread.currentThread().getName()=main
         CountOperate this.getName()=Thread-0
         CountOperate----end
         run-----begin
         run Thread.currentThread().getName()=Thread-0
         run this.getName()=Thread-0
         run ----end

         */
//        count.start();

        /**
         CountOperate----begin
         CountOperate Thread.currentThread().getName()=main
         CountOperate this.getName()=Thread-0
         CountOperate----end
         run-----begin
         run Thread.currentThread().getName()=A
         run this.getName()=Thread-0
         run ----end
         */
        Thread t1 = new Thread(count);
        t1.setName("A");
        t1.start();
    }
}
