package com.kly.ants.thread.create;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/22 11:58
 */
public class Test1Thread implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable run");
    }

    public static void main(String[] args) {
        Thread testThread = new Thread(new Test1Thread());
        testThread.start();
    }
}
