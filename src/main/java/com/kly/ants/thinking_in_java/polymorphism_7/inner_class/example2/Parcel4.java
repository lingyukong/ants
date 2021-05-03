package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example2;


import com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example1.Destination;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/21 10:33
 * @see
 */
public class Parcel4 {
    public Destination dest(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel() {
                System.out.println("PDestination:");
                return label;
            }
        }
        return new PDestination(s);
    }
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Destination d = p.dest("Tanzania");
        System.out.println(d.readLabel());
    }
}
