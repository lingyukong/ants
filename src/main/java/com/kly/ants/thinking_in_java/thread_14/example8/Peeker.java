package com.kly.ants.thinking_in_java.thread_14.example8;

import java.awt.*;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/4/5 20:14
 * @see
 */
public class Peeker extends Thread {
    private Blockable b;
    private int session;
    private TextField status = new TextField(40);
    private boolean stop = false;
    public Peeker(Blockable b, Container c) {
        c.add(status);
        this.b = b;
        start();
    }
    public void terminate() { stop = true; }
    public void run() {
        while (!stop) {
            status.setText(b.getClass().getName()
                    + " Peeker " + (++session)
                    + "; value = " + b.read());
            try {
                sleep(100);
            } catch (InterruptedException e){}
        }
    }
}
