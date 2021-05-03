package com.kly.ants.thinking_in_java.thread_14.example6;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * <p>Description:
 *
 本例揭示了使用线程时一个非常基本的问题。我们跟无从知道一个线程什么时候运行。想象自己坐在一张桌
 子前面，桌上放有一把叉子，准备叉起自己的最后一块食物。当叉子要碰到食物时，食物却突然消失了（因
 为这个线程已被挂起，同时另一个线程进来“偷”走了食物）。这便是我们要解决的问题。
 有的时候，我们并不介意一个资源在尝试使用它的时候是否正被访问（食物在另一些盘子里）。但为了让多
 线程机制能够正常运转，需要采取一些措施来防止两个线程访问相同的资源——至少在关键的时期。
 为防止出现这样的冲突，只需在线程使用一个资源时为其加锁即可。访问资源的第一个线程会其加上锁以
 后，其他线程便不能再使用那个资源，除非被解锁。如果车子的前座是有限的资源，高喊“这是我的！”的
 孩子会主张把它锁起来。
 * </p>
 *
 * @author kly
 * @Date 2018/1/28 16:19
 * @see
 */
public class Sharing1 extends Applet {
    TwoCounter[] s;
    private static int accessCount = 0;
    private static TextField aCount =
            new TextField("0", 10);

    public static void incrementAccess() {
        accessCount++;
        aCount.setText(Integer.toString(accessCount));
    }
    private Button
            start = new Button("Start"),
            observer = new Button("Observe");
    private boolean isApplet = true;
    private int numCounters = 0;
    private int numObservers = 0;
    public void init() {
        if(isApplet) {
            numCounters =
                    Integer.parseInt(getParameter("size"));
            numObservers =
                    Integer.parseInt(
                            getParameter("observers"));
        }
        s = new TwoCounter[numCounters];
        for(int i = 0; i < s.length; i++) {
            s[i] = new TwoCounter(this);
        }

        Panel p = new Panel();
        start.addActionListener(new StartL());
        p.add(start);
        observer.addActionListener(new ObserverL());
        p.add(observer);
        p.add(new Label("Access Count"));
        p.add(aCount);
        add(p);
    }
    class StartL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for(int i = 0; i < s.length; i++)
                s[i].start();
        }
    }
    class ObserverL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for(int i = 0; i < numObservers; i++)
                new Watcher(Sharing1.this);
        }
    }
    public static void main(String[] args) {
        Sharing1 applet = new Sharing1();
// This isn't an applet, so set the flag and
// produce the parameter values from args:
        applet.isApplet = false;
        applet.numCounters =
                (args.length == 0 ? 1 :
                        Integer.parseInt(args[0]));
        applet.numObservers =
                (args.length < 2 ? 1 :
        Integer.parseInt(args[1]));
        Frame aFrame = new Frame("Sharing1");
        aFrame.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
        aFrame.add(applet, BorderLayout.CENTER);
        aFrame.setSize(350, applet.numCounters *100);
        applet.init();
        applet.start();
        aFrame.setVisible(true);
    }
}
