package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example1;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/21 9:56
 * @see
 */
public class Parcel3 {

    private class PContents extends Contents {
        private int i = 11;
        public int value() { return i; }
    }

    protected class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo) {
            label = whereTo;
        }
        public String readLabel() { return label; }
    }

    public Destination dest(String s) {
        return new PDestination(s);
    }
    public Contents cont() {
        return new PContents();
    }

}
