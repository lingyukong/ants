package com.kly.ants.thinking_in_java.thread_14.example6;

import java.awt.*;

/**
 * <p>Description:
 *   在程序运行的时候，你会发现count1和 count2 被“观察”
     （用Watcher观察）的次数是不相等的！这是由线程的本质造成的——它们可在任何时候挂起（暂停）。所
     以在上述两行的执行时刻之间，有时会出现执行暂停现象。同时，Watcher线程也正好跟随着进来，并正好
     在这个时候进行比较，造成计数器出现不相等的情况。

 * </p>
 *
 * @author kly
 * @Date 2018/1/28 16:18
 * @see
 */
public class TwoCounter extends Thread {
    private boolean started = false;
    private TextField
            t1 = new TextField(5),
            t2 = new TextField(5);
    private Label l =
            new Label("count1 == count2");
    private int count1 = 0, count2 = 0;
// Add the display components as a panel
    // to the given container:
    public TwoCounter(Container c) {
        Panel p = new Panel();
        p.add(t1);
        p.add(t2);
        p.add(l);
        c.add(p);
    }
    public void start() {
        if(!started) {
            started = true;
            super.start();
        }
    }
    public void run() {
        while (true) {
            System.out.println("count1=" + count1);
            System.out.println("count2=" + count1);
            t1.setText(Integer.toString(count1++));
            t2.setText(Integer.toString(count2++));
            try {
                sleep(100);
            } catch (InterruptedException e){}
        }
    }
    public void synchTest() {
        Sharing1.incrementAccess();
        if(count1 != count2)
            l.setText("Unsynched");
    }
}
