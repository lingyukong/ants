package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example2;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/21 10:24
 * @see
 */
public class Parcel7 {
    public Wrapping wrap(int x) {
    // Base constructor call:
        return new Wrapping(x) {
            public int value() {
                System.out.println("1");
                return super.value() * 47;
            }
        }; // Semicolon required
    }
    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Wrapping w = p.wrap(10);
    }

}
