package com.kly.ants.thinking_in_java.thread_14.example1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * <p>Description:
 * 1:无论我们是否明确使用了线程，都可利用Thread.currentThread()产生由程序使用的当前线程，然后为那个线程调用sleep()
 * </p>
 *
 * @author kly
 * @Date 2018/1/27 16:41
 * @see
 */
public class Counter1 extends Applet{
    private int count = 0;
    private Button
            onOff = new Button("Toggle"),
            start = new Button("Start");
    private TextField t = new TextField(10);
    private boolean runFlag = true;
    public void init() {
        add(t);
        start.addActionListener(new StartL());
        add(start);
        onOff.addActionListener(new OnOffL());
        add(onOff);
    }

    /**
     *  程序会进入该方法一直在执行，导致外部点击Toggle方法无法响应事件
     *  因为go方法会进入无限循环，单线程，程序不会在对其他任何事件进行控制
     */
    public void go() {
        while (true) {
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
            }
            if (runFlag)
                t.setText(Integer.toString(count++));
        }
    }

    class StartL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            go();
        }
    }
    class OnOffL implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            System.out.println( "OnOffL");
            runFlag = !runFlag;
        }
    }


    public static void main(String[] args) {
        Counter1 applet = new Counter1();
        Frame aFrame = new Frame("Counter1");
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
