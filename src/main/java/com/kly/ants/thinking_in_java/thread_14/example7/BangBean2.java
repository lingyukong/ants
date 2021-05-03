package com.kly.ants.thinking_in_java.thread_14.example7;

import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.util.Vector;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  类：Canvas
 *      Canvas 组件表示屏幕上一个空白矩形区域，应用程序可以在该区域内绘图，或者可以从该区域捕获用户的输入事件。
        应用程序必须为 Canvas 类创建子类，以获得有用的功能（如创建自定义组件）。必须重写 paint 方法，以便在 canvas 上执行自定义图形
 * @author kly
 * @Date 2018/4/4 9:41
 * @see
 */
public class BangBean2 extends Canvas implements Serializable {
    private int xm, ym;
    private int cSize = 20; // Circle size
    private String text = "Bang!";
    private int fontSize = 48;
    private Color tColor = Color.red;
    private Vector actionListeners = new Vector();

    public BangBean2() {
        addMouseListener(new ML()); //添加指定的鼠标侦听器，以接收发自此组件的鼠标事件
        addMouseMotionListener(new MM());//添加指定的鼠标移动侦听器，以接收发自此组件的鼠标移动事件
    }

    public synchronized int getCircleSize() {
        return cSize;
    }

    public synchronized void setCircleSize(int newSize) {
        cSize = newSize;
    }

    public synchronized String getBangText() {
        return text;
    }

    public synchronized void setBangText(String newText) {
        text = newText;
    }

    public synchronized int getFontSize() {
        return fontSize;
    }

    public synchronized void setFontSize(int newSize) {
        fontSize = newSize;
    }

    public synchronized Color getTextColor() {
        return tColor;
    }

    public synchronized void setTextColor(Color newColor) {
        tColor = newColor;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawOval(xm - cSize / 2, ym - cSize / 2,
                cSize, cSize);
    }

    // This is a multicast listener, which is
    // more typically used than the unicast
    // approach taken in BangBean.java:
    public synchronized void addActionListener(
            ActionListener l) {
        actionListeners.addElement(l);
    }

    public synchronized void removeActionListener(
            ActionListener l) {
        actionListeners.removeElement(l);
    }

    // Notice this isn't synchronized:
    public void notifyListeners() {
        ActionEvent a =
                new ActionEvent(BangBean2.this,
                        ActionEvent.ACTION_PERFORMED, null);
        Vector lv = null;
        // Make a copy of the vector in case someone
        // adds a listener while we're
        // calling listeners:
        synchronized (this) {
            lv = (Vector) actionListeners.clone();
        }
        // Call all the listener methods:
        for (int i = 0; i < lv.size(); i++) {
            ActionListener al =
                    (ActionListener) lv.elementAt(i);
            al.actionPerformed(a);
        }
    }

    /**
     * MouseAdapter:
     * 接收鼠标事件的抽象适配器类。此类中的方法为空。此类存在的目的是方便创建侦听器对象。
       鼠标事件使用户能够跟踪鼠标何时被按下、释放、单击、移动、拖动、何时进入一个组件、何时退出、何时滚动鼠标滚轮
     */
    class ML extends MouseAdapter {

        /**
         * 鼠标按键在组件上按下时调用。
         * @param e
         */
        public void mousePressed(MouseEvent e) {
            Graphics g = getGraphics();
            g.setColor(tColor);
            g.setFont(
                    new Font(
                            "TimesRoman", Font.BOLD, fontSize));
            int width =
                    g.getFontMetrics().stringWidth(text);
            g.drawString(text,
                    (getSize().width - width) / 2,
                    getSize().height / 2);
            g.dispose();
            notifyListeners();
        }
    }

    /**
     *
     */
    class MM extends MouseMotionAdapter {
        /**
         * 鼠标按键在组件上移动（无按键按下）时调用。
         * @param e
         */
        public void mouseMoved(MouseEvent e) {
            xm = e.getX();
            ym = e.getY();
            repaint();
        }
    }

    // Testing the BangBean2:
    public static void main(String[] args) {
        BangBean2 bb = new BangBean2();
        bb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent" + e);
            }
        });
        bb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("BangBean2 action");
            }
        });
        bb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("More action");
            }
        });
        Frame aFrame = new Frame("BangBean2 Test");
        aFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        aFrame.add(bb, BorderLayout.CENTER);
        aFrame.setSize(300, 300);
        aFrame.setVisible(true);
    }
}
