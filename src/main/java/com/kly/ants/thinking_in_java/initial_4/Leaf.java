package com.kly.ants.thinking_in_java.initial_4;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/15 18:03
 * @see
 */
public class Leaf {
    private int i = 0;

    public Leaf increment() {
        i++;
        return this;
    }

    public void print() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}
