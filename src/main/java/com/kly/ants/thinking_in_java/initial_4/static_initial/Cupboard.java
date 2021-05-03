package com.kly.ants.thinking_in_java.initial_4.static_initial;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/16 10:41
 * @see
 */
public class Cupboard {
    Bowl b3 = new Bowl(3);
    public static Bowl b4 = new Bowl(4);
    public static Bowl b5 = new Bowl(5);

    public Cupboard(){
        System.out.println("create Cupboard");
        b4.f1(2);
    }

    public void f3(int marker) {
        System.out.println("f3:" + marker);
    }
}
