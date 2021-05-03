package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example5;

/**
 * <p>Description:
 * 除非已拥有外部类的一个对象（Parcel11），否则不可能创建内部类的一个对象。这是由于内部类的对象已同创建
   它的外部类的对象“默默”地连接到一起。然而，如果生成一个static 内部类，就不需要指向外部类对象的
 一个句柄
 * </p>
 *
 * @author kly
 * @Date 2018/1/21 15:26
 * @see
 */
public class Parcel11 {
    class Contents {
        private int i = 11;
        public int value() { return i; }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() { return label; }
    }
    public static void main(String[] args) {
        Parcel11 p = new Parcel11();
        // Must use instance of outer class
        // to create an instances of the inner class:
        Contents c = p.new Contents();
        Destination d =
                p.new Destination("Tanzania");
    }
}
