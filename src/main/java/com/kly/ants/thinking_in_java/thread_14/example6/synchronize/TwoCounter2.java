package com.kly.ants.thinking_in_java.thread_14.example6.synchronize;

import java.awt.*;

/**
 * <p>Description:
 * 调用任何synchronized方法时，对象就会被锁定，不可再调用那个对象的其他任何synchronized 方法，
 * 除非第一个方法完成了自己的工作，并解除锁定。
 * 一个特定对象的所有 synchronized方法都共享着一把锁，
 * 而且这把锁能防止多个方法对通用内存同时进行写操作（比如同时有多个线程）。
 *
 * </p>
 *
 * @author kly
 * @Date 2018/2/4 16:13
 * @see
 */
public class TwoCounter2 extends Thread{
    private boolean started = false;
    private TextField
            t1 = new TextField(5),
            t2 = new TextField(5);
    private Label l =
            new Label("count1 == count2");
    private int count1 = 0, count2 = 0;
    public TwoCounter2(Container c) {
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
    public  void run() {
        //在方法上增加同步
//        while (true) {
//            t1.setText(Integer.toString(count1++));
//            t2.setText(Integer.toString(count2++));
//            try {
//                sleep(500);
//            } catch (InterruptedException e){}
//        }

        //对特定代码使用同步块
        while (true) {
            synchronized (this) {
                t1.setText(Integer.toString(count1++));
                t2.setText(Integer.toString(count2++));
            }
            try {
                sleep(500);
            } catch (InterruptedException e){}
        }
    }

    /**
     *
     * 如果给该方法同步加锁，那么该方法会一直不被执行，因为run方法一直没有释放锁，除非给run方法使用同步块。
     */
    public synchronized  void synchTest() {
        Sharing2.incrementAccess();
        if(count1 != count2)
            l.setText("Unsynched");
    }
}

class Watcher2 extends Thread {
    private Sharing2 p;
    public Watcher2(Sharing2 p) {
        this.p = p;
        start();
    }
    public void run() {
        while(true) {
            System.out.println("Watcher2=" +  p.s.length);
            for(int i = 0; i < p.s.length; i++)
                p.s[i].synchTest();
            try {
                sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
