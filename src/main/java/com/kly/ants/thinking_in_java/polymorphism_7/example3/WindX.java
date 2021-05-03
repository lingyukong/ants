package com.kly.ants.thinking_in_java.polymorphism_7.example3;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/20 20:21
 * @see
 */
public class WindX extends InstrumentX {
    // OOPS! Changes the method interface:
    public void play(NoteX n) {
        System.out.println("WindX.play(NoteX n)");
    }
}
