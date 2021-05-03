package com.kly.ants.thinking_in_java.polymorphism_7.example4;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/22 11:12
 * @see
 */
public class LivingCreature {
    Characteristic p =
            new Characteristic("is alive");
    LivingCreature() {
        System.out.println("LivingCreature()");
    }
    protected void finalize() {
        System.out.println(
                "LivingCreature finalize");
    // Call base-class version LAST!
        if(DoBaseFinalization.flag)
            try {
                super.finalize();
            } catch(Throwable t) {}
    }
}
