package com.kly.ants.thinking_in_java.object_contain_8.example6;

import java.util.Enumeration;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/2/27 16:41
 * @see
 */
public class PrintData {
    public static void print(Enumeration e) {
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement().toString());
        }
    }
}
