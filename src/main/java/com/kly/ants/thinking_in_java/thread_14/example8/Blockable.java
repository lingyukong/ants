package com.kly.ants.thinking_in_java.thread_14.example8;

import java.awt.*;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/4/5 20:14
 * @see
 */
public class Blockable extends Thread {
    private Peeker peeker;
    protected TextField state = new TextField(40);//TextField 对象是允许编辑单行文本的文本组件。
    protected int i;
    public Blockable(Container c) {
        c.add(state);
        peeker = new Peeker(this, c);
    }
    public synchronized int read() { return i; }


    protected synchronized void update() {
        state.setText(getClass().getName()
                + " state: i = " + i);
    }
    public void stopPeeker() {
        // peeker.stop(); Deprecated in Java 1.2
        peeker.terminate(); // The preferred approach
    }
}
