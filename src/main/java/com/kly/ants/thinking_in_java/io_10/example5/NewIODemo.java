package com.kly.ants.thinking_in_java.io_10.example5;

import java.io.*;
import java.nio.Buffer;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/12 15:55
 * @see
 */
public class NewIODemo {
    public static void main(String[] args) {
        try {
            /**
             * 读取文件
             * BufferedReader 从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取
             * 如果没有缓冲，则每次调用 read() 或 readLine() 都会导致从文件中读取字节，并将其转换为字符后返回，而这是极其低效的。
             */
//            BufferedReader in1 =  new BufferedReader(new FileReader(args[0]));
//            String s,s2 = "";
//            while ((s = in1.readLine()) != null) {
//                s2 += s;
//                System.out.println(s);
//            }
//            in1.close();


            /**
             * 读取输入字符
             * InputStreamReader 是字节流通向字符流的桥梁
             */
//            BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Enter a line:");
//            System.out.println(in2.readLine());
//            in2.close();


            /**
             * 从内存中读取字符串
             * 创建一个新字符串 reader
             */
//            StringReader in3 = new StringReader(s2);
//            int c ;
//            while ((c = in3.read()) != -1) {
//                System.out.print((char)c);
//            }

            /**
             * 读取带行号的文本并写入到文件中
             */
            LineNumberReader in4 = new LineNumberReader(new FileReader(args[0]));
            BufferedReader in5 = new BufferedReader(in4);
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test3.txt")));
            String line;
            while ((line = in5.readLine()) != null) {
                pw.println(line);
            }
            pw.close();
            in4.close();
            in5.close();
        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}
