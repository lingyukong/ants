package com.kly.ants.thinking_in_java.thread_14.example5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>Description:
 * </p>
 *  在一个main方法里的用户线程 启动了一个守护线程，main方法线程完成之后，守护线程也立即结束
 * @author kly
 * @Date 2018/1/28 15:11
 * @see
 */
public class Daemons {
    public static void main(String[] args) {
        Thread d = new Daemon();
        System.out.println(
                "d.isDaemon() = " + d.isDaemon());
        BufferedReader stdin =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.println("Waiting for CR");
        try {
//            stdin.readLine();
              Thread.sleep(10000);
        } catch(Exception e) {}

    }
}
