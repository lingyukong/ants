package com.kly.ants.thinking_in_java.thread_14.example4;

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
 * @Date 2018/1/28 14:42
 * @see
 */
public class Counter4 extends Applet {
    private Button start = new Button("Start");
    private boolean started = false;
    private Ticker[] s;
    private boolean isApplet = true;
    private int size;

    public void init() {
// Get parameter "size" from Web page:
        if(isApplet)
            size = Integer.parseInt(getParameter("size"));
        s = new Ticker[size];
        for(int i = 0; i < s.length; i++) {
            s[i] = new Ticker(this);
        }
        start.addActionListener(new StartL());
        add(start);
    }

    class StartL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(started);
            if(!started) {
                started = true;
                for(int i = 0; i < s.length; i++)
                    s[i].start();
            }
        }
    }
    public static void main(String[] args) {
        Counter4 applet = new Counter4();
// This isn't an applet, so set the flag and
// produce the parameter values from args:
        applet.isApplet = false;
        applet.size =
                (args.length == 0 ? 5 :
                        Integer.parseInt(args[0]));
        Frame aFrame = new Frame("Counter4");
        aFrame.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
        aFrame.add(applet, BorderLayout.CENTER);
        aFrame.setSize(400, applet.size * 100);
        applet.init();
        applet.start();
        aFrame.setVisible(true);
    }


}
