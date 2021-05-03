package com.kly.ants.thinking_in_java.io_10.serializable_test.example9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/18 10:36
 * @see
 */
public class Blips {
    public static void main(String[] args) {
        System.out.println("Constructing objects:");
        Blip1 b1 = new Blip1();
        Blip2 b2 = new Blip2();
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Blips.out"));
            System.out.println("saving objects------");
            out.writeObject(b1);
            out.writeObject(b2);
            out.close();

            //now get them back
            ObjectInputStream in  = new ObjectInputStream(new FileInputStream("Blips.out"));
            System.out.println("recovering b1----");
            b1 = (Blip1)in.readObject();

            System.out.println("recovering b2----");
            b2 = (Blip2)in.readObject();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
