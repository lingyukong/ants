package com.kly.ants.thinking_in_java.polymorphism_7.example3;

/**
 * <p>Description:
 * “过载”是指同一样东西在不同的地方具有多种含义；而“覆盖”是指它随时随地都
 只有一种含义，只是原先的含义完全被后来的含义取代了,play方法被过载</p>
 *
 * @author kly
 * @Date 2018/1/20 20:22
 * @see
 */
public class WindError {
    public static void tune(InstrumentX i) {
    // ...
        i.play(NoteX.MIDDLE_C);
    }
    public static void main(String[] args) {
        WindX flute = new WindX();
        tune(flute); // Not the desired behavior!
    }
}
