package com.kly.ants.thinking_in_java.io_10.example6;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/12 16:51
 * @see
 */
public class GZIPcompress {
    public static void main(String[] args) {
        try {
            /**
             * 压缩
             * GZIPOutputStream 只接受OutputStream字节流
             */
//            BufferedReader in = new BufferedReader(new FileReader(args[0]));
//            BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("test.zip")));
//            int c;
//            while((c = in.read()) != -1) {
//                out.write(c);
//            }
//            in.close();
//            out.close();

            /**
             * 读取压缩文件
             * InputStreamReader 是字节流和字符的转接桥梁
             */
            BufferedReader in2 = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("test.zip"))));
            String s;
            while ((s = in2.readLine()) != null) {
                System.out.println(s);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
