package com.kly.ants.thinking_in_java.create_class_6.finaltest.example3;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/19 11:19
 * @see
 */
public class Jurassic{
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
        System.out.println(n.i);
        System.out.println(n.j);
    }
}
