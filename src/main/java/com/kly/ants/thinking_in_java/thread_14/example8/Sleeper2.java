package com.kly.ants.thinking_in_java.thread_14.example8;

import java.awt.*;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/4/5 20:58
 * @see
 */
public class Sleeper2 extends Blockable {
    public Sleeper2(Container c) {
        super(c);
    }

    public void run() {
        while(true) {
            change();
            try {
                sleep(1000);
            } catch (InterruptedException e){}
        }
    }
    public synchronized void change() {
        i++;
        update();
    }
}
