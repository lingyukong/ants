package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example7;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/21 15:55
 * @see
 */
public class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.Yolk()");
        }
        public void f() {
            System.out.println("BigEgg2.Yolk.f()");
        }
    }
    public BigEgg2() { insertYolk(new Yolk()); }
    public static void main(String[] args) {
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}