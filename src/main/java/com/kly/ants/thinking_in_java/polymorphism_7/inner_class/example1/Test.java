package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example1;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/21 9:59
 * @see
 */
public class Test {

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Contents c = p.cont();
        Destination d = p.dest("Tanzania");
        // Illegal -- can't access private class:
        //! Parcel3.PContents c = p.new PContents();
        //p.new PDestination("1");
    }
}
