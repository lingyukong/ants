package com.kly.ants.thinking_in_java.io_10.serializable_test.example10.cad;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/19 10:22
 * @see
 */
public class Square extends Shape {
    private static int color;


    public Square(int xVal, int yVal, int dim) {
        super(xVal, yVal, dim);
        color = RED;
    }

    @Override
    public void setColor(int newColor) {
        color = newColor;
    }

    @Override
    public int getColor() {
        return color;
    }
}
