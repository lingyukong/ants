package com.kly.ants.thinking_in_java.create_class_6;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/18 11:28
 * @see
 */
public class Bath {
    private String
    s1 = new String("Happy"),
    s2 = "Happy",
    s3, s4;
    Soap castille;
    int i;
    float toy;
    Bath() {
        System.out.println("Inside Bath()");
        s3 = new String("Joy");
        i = 47;
        toy = 3.14f;
        castille = new Soap();
    }
    void print() {
   // Delayed initialization:
        if(s4 == null)
            s4 = new String("Joy");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("i = " + i);
        System.out.println("toy = " + toy);
        System.out.println("castille = " + castille);
    }
    public static void main(String[] args) {
//        Bath b = new Bath();
//        b.print();
        Soap1 soap1 = new Soap1();
        Soap soap = new Soap();
        System.out.println(soap1);
        System.out.println(soap);
    }
}
