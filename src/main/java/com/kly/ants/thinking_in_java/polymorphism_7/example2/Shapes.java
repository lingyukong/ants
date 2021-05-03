package com.kly.ants.thinking_in_java.polymorphism_7.example2;

/**
 * <p>Description: 注意上溯造型是在每个return 语句里发生的</p>
 *
 * @author kly
 * @Date 2018/1/20 17:33
 * @see
 */
public class Shapes {

    public static Shape randShape() {
        switch((int)(Math.random() * 3)) {
            default: // To quiet the compiler
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = randShape();
        // Make polymorphic method calls:
        for (Shape i: s) {
            i.draw();
        }
//        for(int i = 0; i < s.length; i++)
//            s[i].draw();
    }
}
