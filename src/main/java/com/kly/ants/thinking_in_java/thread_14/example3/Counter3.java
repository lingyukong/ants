package com.kly.ants.thinking_in_java.thread_14.example3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * <p>Description:
     * 某样东西有一个Runnable 接口，实际只是意味着它有一个run()方法，但不存在与之相关的任何特殊东
       西——它不具有任何天生的线程处理能力，这与那些从Thread 继承的类是不同的

     所以为了从一个
     Runnable 对象产生线程，必须单独创建一个线程，并为其传递Runnable 对象；可为其使用一个特殊的构建
     器，并令其采用一个Runnable 作为自己的参数使用。随后便可为那个线程调用 start()，如下所示：
     selfThread.start();

     Runnable 接口最大的一个优点是所有东西都从属于相同的类。若需访问什么东西，只需简单地访问它即可，
     不需要涉及一个独立的对象
 * </p>
 *
 * @author kly
 * @Date 2018/1/27 21:06
 * @see
 */
public class Counter3 extends Applet implements Runnable {
    private int count = 0;
    private boolean runFlag = true;
    private Thread selfThread = null;
    private Button
            onOff = new Button("Toggle"),
            start = new Button("Start");
    private TextField t = new TextField(10);
    public void init() {
        add(t);
        start.addActionListener(new StartL());
        add(start);
        onOff.addActionListener(new OnOffL());
        add(onOff);
    }
    class StartL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(selfThread == null) {
                selfThread = new Thread(Counter3.this); //调用外部类当前实例
                selfThread.start();
            }
        }
    }
    class OnOffL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            runFlag = !runFlag;
        }
    }

    public void run() {
        while (true) {
            try {
                selfThread.sleep(1000);
            } catch (InterruptedException e){}
            if(runFlag)
                t.setText(Integer.toString(count++));
                System.out.println(count);
        }
    }

    public static void main(String[] args) {
        Counter3 applet = new Counter3();
        Frame aFrame = new Frame("Counter3");
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
