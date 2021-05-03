package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example2;


import com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example1.Destination;

/**
 * <p>Description: 若试图定义一个匿名内部类，并想使用在匿名内部类外部定义的一个对象，则编译器要求外部对象为final
 属性</p>
 *
 * @author kly
 * @Date 2018/1/21 10:46
 * @see
 */
public class Parcel8 {
    // Argument must be final to use inside
// anonymous inner class:
    public Destination dest(final String dest) {
        return new Destination() {
            private String label = dest;
            public String readLabel() { return label; }
    };
    }
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Destination d = p.dest("Tanzania");
    }
}
