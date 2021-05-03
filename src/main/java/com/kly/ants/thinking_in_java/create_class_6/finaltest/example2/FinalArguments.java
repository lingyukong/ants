package com.kly.ants.thinking_in_java.create_class_6.finaltest.example2;

/**
 * <p>Description:final修饰形参，同理，在方法内，基础类型不能改变自身的值，对象不能改变句柄 </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/19 10:49
 * @see
 */
public class FinalArguments {
    void with(final Gizmo g) {
    //! g = new Gizmo(); // Illegal -- g is final
        g.spin();
    }
    void without(Gizmo g) {
        g = new Gizmo(); // OK -- g not final
        g.spin();
    }
    // void f(final int i) { i++; } // Can't change
    // You can only read from a final primitive:
    int g(final int i) {
        return i + 1;
    }
    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
