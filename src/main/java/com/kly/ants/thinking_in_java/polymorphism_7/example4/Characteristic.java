package com.kly.ants.thinking_in_java.polymorphism_7.example4;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/22 11:09
 * @see
 */
public class Characteristic {
    String s;
    Characteristic(String c) {
        s = c;
        System.out.println(
                "Creating Characteristic " + s);
    }
    protected void finalize() {
        System.out.println(
                "finalizing Characteristic " + s);
    }
}
