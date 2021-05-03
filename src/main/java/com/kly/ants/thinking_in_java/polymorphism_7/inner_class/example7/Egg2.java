package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example7;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/21 15:55
 * @see
 */
public class Egg2 {
    private Yolk y = new Yolk();

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }
        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }

    public Egg2() {
        System.out.println("New Egg2()");
    }
    public void insertYolk(Yolk yy) { y = yy; }
    public void g() { y.f(); }
}
