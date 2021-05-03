package com.kly.ants.thinking_in_java.polymorphism_7.example1;

public class Music {

    public static void tune(Instrument i) {
        // ...
        i.play(Note.middleC);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
}
