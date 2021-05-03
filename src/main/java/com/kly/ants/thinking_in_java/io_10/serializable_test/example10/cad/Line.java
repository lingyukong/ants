package com.kly.ants.thinking_in_java.io_10.serializable_test.example10.cad;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/19 10:23
 * @see
 */
public class Line extends Shape {
    private static  int color = RED;

    public static void serializeStaticState(ObjectOutputStream os)
            throws IOException {
        os.writeInt(color);
    }

    public static void deserializeStaticState(ObjectInputStream os)
            throws IOException {
        color = os.readInt();
    }
    public Line(int xVal, int yVal, int dim) {
        super(xVal, yVal, dim);
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
