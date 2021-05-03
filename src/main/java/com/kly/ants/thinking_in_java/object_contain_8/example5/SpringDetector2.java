package com.kly.ants.thinking_in_java.object_contain_8.example5;

import java.util.Hashtable;

/**
 * <p>Description:
 * 采用重写之后的equals和hashCode方法，判断就为相等了
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/25 17:37
 * @see
 */
public class SpringDetector2 {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        for (int i=0;i<10;i++) {
            table.put(new Groundhog2(i), new Prediction());
        }
        System.out.println("ht = " + table + "\n");
        System.out.println(
                "Looking up prediction for groundhog #3:");
        Groundhog2 gh = new Groundhog2(3);
        if(table.containsKey(gh)) {
            System.out.println((Prediction)table.get(gh));
        }

    }
}
