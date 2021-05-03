package com.kly.ants.thinking_in_java.polymorphism_7.example4;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/22 11:13
 * @see
 */
public class Animal extends LivingCreature {
    Characteristic p =
            new Characteristic("has heart");
    Animal() {
        System.out.println("Animal()");
    }
    protected void finalize() {
        System.out.println("Animal finalize");
        if(DoBaseFinalization.flag)
            try {
                super.finalize();
            } catch(Throwable t) {}
    }
}
