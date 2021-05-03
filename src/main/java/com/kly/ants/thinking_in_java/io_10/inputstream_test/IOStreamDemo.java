package com.kly.ants.thinking_in_java.io_10.inputstream_test;

import java.io.*;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  典型的IO流使用
 * @author kly
 * @Date 2018/4/11 11:04
 * @see
 */
public class IOStreamDemo {

    public static void main(String[] args) {
        try {

            /**
             * 缓冲的输入文件
             * 在创建 BufferedInputStream 时，会创建一个内部缓冲区数组
             * FileInputStream 从文件系统中的某个文件中获得输入字节。哪些文件可用取决于主机环境
             * 创建一个FileInputStream同文件相连
             */
             // 1. Buffered input file
            DataInputStream in =
                    new DataInputStream(new BufferedInputStream(new FileInputStream(args[0])));
            String s, s2 = new String();
            while((s = in.readLine())!= null){
                s2 += s + "\n";
            }
            in.close();


            /**
             * 从内存输入
             */
            // 2. Input from memory
//            StringBufferInputStream in2 =
//                    new StringBufferInputStream("StringBufferInputStream" + s2);
//            int c;
//            while((c = in2.read()) != -1){
//                System.out.print((char)c);
//            }

            /**
             * 格式化内存输入
             */
            // 3. Formatted memory input
//            try {
//                DataInputStream in3 =
//                        new DataInputStream(
//                                new StringBufferInputStream(s2));
//                while(true)
//                    System.out.print((char)in3.readByte());
//            } catch(EOFException e) {
//                System.out.println(
//                        "End of stream encountered");
//            }

            /**
             * 行的编号与文件输出
             * PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式
             * 首先创建一个FileOutputStream 同文件进行连接,考虑到效率方面的原因，它生成了一个BufferedOutputStream
             * PrintStream能格式化数据，使其能按我们的习惯阅读
             */
            // 4. Line numbering & file output
//            try {
//                LineNumberInputStream li =
//                        new LineNumberInputStream(
//                                new StringBufferInputStream(s2));
//                DataInputStream in4 = new DataInputStream(li);
//                PrintStream out1 =
//                        new PrintStream(new BufferedOutputStream(new FileOutputStream("IODemo.out")));
//
//
//                while((s = in4.readLine()) != null ) {
//                    out1.println("Line " + li.getLineNumber() + s);
//                }
//                out1.close(); // finalize() not reliable!
//            } catch(EOFException e) {
//                System.out.println(
//                        "End of stream encountered");
//            }

            // 5. Storing & recovering data
//            try {
//                DataOutputStream out2 =
//                        new DataOutputStream(
//                                new BufferedOutputStream(
//                                        new FileOutputStream("Data.txt")));
//                out2.writeBytes(
//                        "Here's the value of pi: \n");
//                out2.writeDouble(3.14159);
//                out2.close();
//                DataInputStream in5 =
//                        new DataInputStream(
//                                new BufferedInputStream(
//                                        new FileInputStream("Data.txt")));
//                System.out.println(in5.readLine());
//                System.out.println(in5.readDouble());
//            } catch(EOFException e) {
//                System.out.println(
//                        "End of stream encountered");
//            }


            // 6. Reading/writing random access files
//            RandomAccessFile rf =
//                    new RandomAccessFile("rtest.txt", "rw");
//            for(int i = 0; i < 10; i++) {
//                rf.writeDouble(i*1.414);
//            }
//            rf.close();
//
//
//            rf = new RandomAccessFile("rtest.txt", "rw");
//            System.out.println(rf.length()); //按字节测量的此文件的长度
//            rf.seek(5*8); //从文件开头以字节为单位测量的偏移量位置
//            rf.writeDouble(47.0001);
//            rf.close();
//
//            rf = new RandomAccessFile("rtest.txt", "r");
//
//
//            for(int i = 0; i < 10; i++) {
//                System.out.println(
//                        "Value " + i + ": " +
//                                rf.readDouble());
//            }
//            rf.close();
//

            // 7. File input shorthand
            InFile in6 = new InFile(args[0]);
            String s3 = new String();
            System.out.println(
                    "First line in file: " +
                            in6.readLine());
            in6.close();


            // 8. Formatted file output shorthand
            PrintFile out3 = new PrintFile("Data2.txt");
            out3.print("Test of PrintFile");
            out3.close();


            // 9. Data file output shorthand
            OutFile out4 = new OutFile("Data3.txt");
            out4.writeBytes("Test of outDataFile\n\r");
            out4.writeChars("Test of outDataFile\n\r");
            out4.close();


        } catch(FileNotFoundException e) {
            System.out.println(
                    "File Not Found:" + args[0]);
        } catch(IOException e) {
            System.out.println("IO Exception");
        }
    }
}
