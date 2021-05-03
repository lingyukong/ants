package com.kly.ants.thinking_in_java.initial_4;

/**
 * <p>Description: 初始化顺序
 * 在一个类里，初始化的顺序是由变量在类内的定义顺序决定的。即使变量定义大量遍布于方法定义的中间，
   那些变量仍会在调用任何方法之前得到初始化——甚至在构建器调用之前
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/15 11:56
 * @see
 */
public class OrderOfInitialization {

    public static void main(String[] args) {
        Card t = new Card();
        t.f(); // Shows that construction is done
    }
}
