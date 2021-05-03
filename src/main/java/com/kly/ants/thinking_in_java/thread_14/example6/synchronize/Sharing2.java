package com.kly.ants.thinking_in_java.thread_14.example6.synchronize;

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
 * @Date 2018/2/4 16:14
 * @see
 */
public class Sharing2 extends Applet {
    TwoCounter2[] s;
    private static int accessCount = 0;
    private static TextField aCount =
            new TextField("0", 10);
    public static void incrementAccess() {
        System.out.println("accessCount=" + accessCount);
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
        s = new TwoCounter2[numCounters];
        for(int i = 0; i < s.length; i++)
            s[i] = new TwoCounter2(this);
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
                new Watcher2(Sharing2.this);
        }
    }
    public static void main(String[] args) {
        Sharing2 applet = new Sharing2();
// This isn't an applet, so set the flag and
// produce the parameter values from args:
        applet.isApplet = false;
        applet.numCounters =
                (args.length == 0 ? 5 :
                        Integer.parseInt(args[0]));
        applet.numObservers =
                (args.length < 2 ? 5 :
                        Integer.parseInt(args[1]));
        Frame aFrame = new Frame("Sharing2");
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
