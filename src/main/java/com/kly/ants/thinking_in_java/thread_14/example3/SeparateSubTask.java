package com.kly.ants.thinking_in_java.thread_14.example3;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/27 20:40
 * @see
 */
public class SeparateSubTask extends Thread {
    private int count = 0;
    private Counter2 c2;
    private boolean runFlag = true;

    public SeparateSubTask (Counter2 c2) {
        this.c2 = c2;
        start();
    }

    public void invertFlag() { runFlag = !runFlag;}

    public void run() {
        while(true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (runFlag) {
                c2.t.setText(Integer.toString(count++));
            }
        }
    }

}
