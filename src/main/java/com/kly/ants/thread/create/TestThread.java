package com.kly.ants.thread.create;
//package thread.producerConsumer.disruptor;
/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2019/12/16 13:40
 */
public class TestThread extends Thread{

    public void run() {
        System.out.println("I run");
    }


    public static void main(String[] args) {
        for(int i=0;i<10 ;i++) {
            TestThread thread = new TestThread();
            thread.start();
        }
    }
}
