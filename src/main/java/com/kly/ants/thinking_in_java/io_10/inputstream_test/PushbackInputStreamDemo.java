package com.kly.ants.thinking_in_java.io_10.inputstream_test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/5/2 10:33
 * @see
 */
public class PushbackInputStreamDemo {

    public static void main(String[] args) throws IOException {
        String s = "if (a == 4) a = 0;\\n";
        byte[] bytes = s.getBytes();
        PushbackInputStream pis = new PushbackInputStream(
                new ByteArrayInputStream(bytes));
        int c ;
        while((c = pis.read()) != -1) {
            switch(c) {
                case '=': //自动转型进行匹配
                    if ((c = pis.read()) == '=') {
                        System.out.print(".eq.");
                    } else {
                        System.out.print("<-");
                        pis.unread(c);
                    }
                    break;
                default:
                    System.out.print((char)c);
                    break;
            }
        }
//        System.out.println('=' == 61);

    }

}
