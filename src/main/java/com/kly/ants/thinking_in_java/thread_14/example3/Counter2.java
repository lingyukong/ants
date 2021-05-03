package com.kly.ants.thinking_in_java.thread_14.example3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/27 20:40
 * @see
 */
public class Counter2 extends Applet {
    TextField t = new TextField(10);
    private SeparateSubTask sp = null;
    private Button
            onOff = new Button("Toggle"),
            start = new Button("Start");
    public void init() {
        add(t);
        start.addActionListener(new StartL());
        add(start);
        onOff.addActionListener(new OnOffL());
        add(onOff);
    }


    /**
     * 启动一个线程SeparateSubTask，让主程序得以继续
     */
    class StartL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(sp == null)
                sp = new SeparateSubTask(Counter2.this);
        }
    }
    class OnOffL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(sp != null)
                sp.invertFlag();
        }
    }
    public static void main(String[] args) {
        Counter2 applet = new Counter2();
        Frame aFrame = new Frame("Counter2");
        aFrame.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
        aFrame.add(applet, BorderLayout.CENTER);
        aFrame.setSize(300,200);
        applet.init();
        applet.start();
        aFrame.setVisible(true);
    }

}
