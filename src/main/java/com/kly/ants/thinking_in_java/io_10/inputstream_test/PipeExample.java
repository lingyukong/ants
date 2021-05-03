package com.kly.ants.thinking_in_java.io_10.inputstream_test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  Pipes是在同一个JVM，不同线程间进行通信，如果在同一个线程间使用管道的读和写，可能会造成死锁
 * @author kly
 * @Date 2018/5/2 17:17
 * @see
 */
public class PipeExample {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream pot = new PipedOutputStream();//创建尚未连接到管道输入流的管道输出流
        final PipedInputStream pis = new PipedInputStream(pot);//创建PipedInputStream，使其连接到管道输出流 src。


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("t1");
                    pot.write("hello I am a piped".getBytes());
                    pot.close(); //流使用完一定要记得关闭，否则会报错或者出现一些其他问题
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread t2=  new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("t2");
                    int data;
                    while((data = pis.read())!=-1) {
                        System.out.print((char)data);
                    }
                    pis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

    }
}
