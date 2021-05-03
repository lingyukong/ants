package com.kly.ants.thinking_in_java.initial_4.static_initial;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/16 10:36
 * @see
 */
public class Table {
    public static Bowl  bow1 = new Bowl(1);
    public static Bowl bow2 = new Bowl(2);

    Table () {
        System.out.println("create table");
        bow2.f1(1);
    }

    public void f2(int marker) {
        System.out.println("f2:" + marker);
    }





}
