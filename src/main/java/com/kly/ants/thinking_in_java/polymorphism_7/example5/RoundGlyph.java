package com.kly.ants.thinking_in_java.polymorphism_7.example5;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/22 11:31
 * @see
 */
public class RoundGlyph extends Glyph{
    int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println(
                "RoundGlyph.RoundGlyph(), radius = "
                        + radius);
    }
    void draw() {
        System.out.println(
                "RoundGlyph.draw(), radius = " + radius);
    }
}
