package com.kly.ants.thinking_in_java.thread_14.example8;

import java.awt.*;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/4/5 20:57
 * @see
 */
public class Sleeper1 extends Blockable {

    public Sleeper1(Container c) {
        super(c);
    }

    public synchronized void run() {
        while(true) {
            i++;
            update();
            try {
                sleep(1000);
            } catch (InterruptedException e){}
        }
    }
}
