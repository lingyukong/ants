package com.kly.ants.thinking_in_java.io_10.inputstream_test;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 * Java提供了相应的System.in，System.out 以及System.err
 * System.out进行标准输出，它已预封装成一个 PrintStream对象。System.err 同样是一个PrintStream
 * 但System.in是一个原始的InputStream，未进行任何封装处理。这意味着尽管能直接使用 System.out 和System.err，但必须事先封
   装System.in，否则不能从中读取数据
 * @author kly
 * @Date 2018/4/12 14:46
 * @see
 */
public class Echo {
    public static void main(String[] args) {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in));
        String s;
        try {
            while((s = in.readLine()).length() != 0)
                System.out.println(s);
        // An empty line terminates the program
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
