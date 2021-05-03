package com.kly.ants.thinking_in_java.io_10.example6;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.*;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/12 17:49
 * @see
 */
public class ZipCompress {

    public static void main(String[] args) {
        try {

            /**
             * 多文件的压缩
             * CheckedOutputStream：需要维护写入数据校验和的输出流。校验和可用于验证输出数据的完整性
             */
//            FileOutputStream f = new FileOutputStream("test.zip");
//            CheckedOutputStream csum = new CheckedOutputStream(f,new Adler32());
//            ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(csum));
//            out.setComment("A test of Java Zipping");//设置 ZIP 文件注释。
//            for(int i=0;i<args.length;i++) {
//                System.out.println("Writing file" + args[i]);
//                BufferedReader reader = new BufferedReader(new FileReader(args[i]));
//                out.putNextEntry(new ZipEntry(args[i]));
//                int c;
//                while((c = reader.read()) != -1) {
//                    out.write(c);
//                }
//                reader.close();
//            }
//            out.close();
//            System.out.println("CheckSum=" + csum.getChecksum().getValue());


            /**
             * 压缩文件的读取
             */
//            System.out.println("Reading file");
//            FileInputStream in = new FileInputStream("test.zip");
//            CheckedInputStream csumi = new CheckedInputStream(in,new Adler32());
//            ZipInputStream in2 = new ZipInputStream(new BufferedInputStream(csumi));
//            ZipEntry en;
//            System.out.println(csumi.getChecksum().getValue());
//            while ((en = in2.getNextEntry()) != null) {
//                System.out.println("Reading file=" + en);
//                int d;
//                while((d = in2.read()) != -1 ) {
//                    System.out.print((char)d);
//                }
//
//            }
//            in2.close();


            /**
             * 另一种方式读取压缩文件并解压成文件
             * 使用ZipFile的性能优于 ZipInputStream
             *  一定要记得关闭流啊
             */
            ZipFile zipfiles  = new ZipFile("test.zip");
            Enumeration e = zipfiles.entries();
            while (e.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) e.nextElement();
                System.out.println(entry + ";" + entry.getSize());
                BufferedWriter wr = new BufferedWriter(new FileWriter(entry.getName()));
                BufferedReader br = new BufferedReader(new InputStreamReader(zipfiles.getInputStream(entry)));
                PrintWriter pw = new PrintWriter(wr);
                String line ;
                while ((line = br.readLine()) != null) {
//                    pw.println(line); //建议打印直接用这个方式，已经格式化好了
                    pw.write(line+ "\r\n"); //如果用write需要加上回车和换行，默认只打印一行
                }
                br.close();
                pw.flush();
                pw.close();
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
