package com.kly.ants.thinking_in_java.io_10.serializable_test.example10.cad;

import java.io.*;
import java.util.Vector;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 * static变量是不能序列化的，static是类变量，与实例无关，反序列化之后的值 和内存中static的值保持一致
 * @author kly
 * @Date 2018/4/19 10:24
 * @see
 */
public class CADState {

    public static void main(String[] args) throws Exception {
        Vector shapeTypes, shapes;
        shapeTypes = new Vector();
        shapes = new Vector();


        // Add handles to the class objects:
        shapeTypes.addElement(Circle.class);
        shapeTypes.addElement(Square.class);
        shapeTypes.addElement(Line.class);


        // Make some shapes:
        for (int i = 0; i < 10; i++) {
            shapes.addElement(Shape.randomFactory());
        }

        // Set all the static colors to GREEN:
        for (int i = 0; i < 10; i++) {
            ((Shape) shapes.elementAt(i))
                    .setColor(Shape.GREEN);
        }

        // Save the state vector:
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("CADState.out"));
////            out.writeObject(shapeTypes);
////            Line.serializeStaticState(out);
//        out.writeObject(shapes);


        System.out.println("ObjectInputStream");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("CADState.out"));
        // Read in the same order they were written:
//            shapeTypes = (Vector)in.readObject();
//            Line.deserializeStaticState(in);
//        for (int i = 0; i < 10; i++) {
//            ((Shape) shapes.elementAt(i))
//                    .setColor(7);
//        }

        shapes = (Vector) in.readObject();
//        // Display the shapes:
////        System.out.println(shapeTypes);
        System.out.println(shapes);
    }
}
