package com.kly.ants.thinking_in_java.polymorphism_7.example4;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/22 11:14
 * @see
 */
public class Amphibian extends Animal {
    Characteristic p =
            new Characteristic("can live in water");
    Amphibian() {
        System.out.println("Amphibian()");
    }
    protected void finalize() {
        System.out.println("Amphibian finalize");
        if(DoBaseFinalization.flag)
            try {
                super.finalize();
            } catch(Throwable t) {}
    }
}
