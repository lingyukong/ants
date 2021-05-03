package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example2;


import com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example1.Contents;

/**
 * <p>Description:匿名类不能拥有一个构建器 </p>
 *
 * @author kly
 * @Date 2018/1/21 10:39
 * @see
 */
public class Parcel6 {
    public Contents cont() {
        return new Contents() {
            private int i = 11;
            public int value() { return i; }
        }; // Semicolon required in this case

        //匿名内部类，相当于如下代码
//        class MyContents extends Contents {
//            private int i = 11;
//            public int value() { return i; }
//        }
//        return new MyContents();
    }
    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        Contents c = p.cont();
    }
}
