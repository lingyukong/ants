package com.kly.ants.thinking_in_java.initial_4.static_initial;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/16 10:44
 * @see
 */
public class StaticInitialization {
    static Table t2 = new Table();
    static Cupboard t3 = new Cupboard();
    public static void main (String[] args) {
        System.out.println("Creating new Cupboard() in main1");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main2");
        new Cupboard();
        t2.f2(1);
        t3.f3(1);
    }
}
