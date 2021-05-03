package com.kly.ants.thinking_in_java.create_class_6.extend;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/18 14:21
 * @see
 */
public class Cartoon extends Drawing {
    Cartoon() {
        System.out.println("create Cartoon");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
