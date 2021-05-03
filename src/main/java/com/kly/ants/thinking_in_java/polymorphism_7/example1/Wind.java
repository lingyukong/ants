package com.kly.ants.thinking_in_java.polymorphism_7.example1;

public class Wind extends Instrument {

    //Redefine interface method
    public void play(Note n) {
        System.out.println("Wind.play()");

    }
}
