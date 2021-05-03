package com.kly.ants.thinking_in_java.thread_14.example6;

/**
 * <p>Description:
 * 观察计数器的值是否相等
 * </p>
 *
 * @author kly
 * @Date 2018/1/28 16:19
 * @see
 */
public class Watcher extends Thread  {
    private Sharing1 p;
    public Watcher(Sharing1 p) {
        this.p = p;
        start();
    }
    public void run() {
        while(true) {
            for(int i = 0; i < p.s.length; i++)
                p.s[i].synchTest();
            try {
                sleep(500);
            } catch (InterruptedException e){}
        }
    }
}
