package com.kly.ants.thinking_in_java.thread_14.example4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/28 14:40
 * @see
 */
public class Ticker extends Thread {
    private Button b = new Button("Toggle");
    private TextField t = new TextField(10);
    private int count = 0;
    private boolean runFlag = true;

    public Ticker(Container c) {
        b.addActionListener(new ToggleL());
        Panel p = new Panel();
        p.add(t);
        p.add(b);
        c.add(p);
    }
    class ToggleL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            runFlag = !runFlag;
        }
    }

    public void run() {
        while (true) {
            if(runFlag)
                t.setText(Integer.toString(count++));
            try {
                sleep(100);
            } catch (InterruptedException e){}
        }
    }

}
