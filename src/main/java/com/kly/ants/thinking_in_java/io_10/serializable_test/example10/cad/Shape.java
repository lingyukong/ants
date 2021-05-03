package com.kly.ants.thinking_in_java.io_10.serializable_test.example10.cad;

import java.io.Serializable;
import java.util.Random;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/19 10:20
 * @see
 */
public abstract class Shape implements Serializable{
    public static final int RED = 1, BLUE = 2, GREEN = 3;
    private int xPos, yPos, dimension;
    private static Random r = new Random();
    private static int counter = 0;

    abstract public void setColor(int newColor);
    abstract public int getColor();


    public Shape(int xVal, int yVal, int dim) {
        xPos = xVal;
        yPos = yVal;
        dimension = dim;
    }
    public String toString() {
        return getClass().toString() +
                " color[" + getColor() +
                "] xPos[" + xPos +
                "] yPos[" + yPos +
                "] dim[" + dimension + "]\n";
    }
    public static Shape randomFactory() {
        int xVal = r.nextInt() % 100;
        int yVal = r.nextInt() % 100;
        int dim = r.nextInt() % 100;
        switch(counter++ % 3) {
            default:
            case 0: return new Circle(xVal, yVal, dim);
            case 1: return new Square(xVal, yVal, dim);
            case 2: return new Line(xVal, yVal, dim);
        }
    }
}
