package com.kly.ants.thinking_in_java.thread_14.example5;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/28 14:59
 * @see
 */
public class DaemonSpawn extends Thread{
    public DaemonSpawn(int i) {
        System.out.println(
                "DaemonSpawn " + i + " started");
        start();
    }
    public void run() {
        while(true)
            yield();//暂停当前正在执行的线程对象，并执行其他线程
    }
}
