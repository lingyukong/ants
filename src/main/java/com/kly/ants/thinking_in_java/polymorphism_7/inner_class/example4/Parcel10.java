package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example4;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/21 15:14
 * @see
 */
public class Parcel10 {
    private static class PContents extends Contents {
        private int i = 11;
        public int value() { return i; }
    }
    protected static class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo) {
            label = whereTo;
        }
        public String readLabel() { return label; }
    }
    public static Destination dest(String s) {
        return new PDestination(s);
    }
    public static Contents cont() {
        return new PContents();
    }
    public static void main(String[] args) {
        Contents c = cont();
        Destination d = dest("Tanzania");
    }
}
