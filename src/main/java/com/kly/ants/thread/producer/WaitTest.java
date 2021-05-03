package com.kly.ants.thread.producer;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/5/9 18:20
 */
public class WaitTest {

    private static Queue queue = new LinkedBlockingQueue<String>();
    private static int maxQueue = 10;


    public static void main(String[] args) {
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (WaitTest.class){
                    if(queue.size() == maxQueue) {
                        //WaitTest.class.wait();
                    }
                }
            }
        });




    }
}
