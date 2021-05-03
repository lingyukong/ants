package com.kly.ants.thinking_in_java.io_10.serializable_test.example9;

import java.io.*;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/18 10:55
 * @see
 */
public class Blip3 implements Externalizable {
    int i;
    String s;

    /**
     * 反序列化会调用默认构建器
     */
    public Blip3() {
        System.out.println("Blip3 Constructor");
    }


    /**
     * 反序列化不会调用该构建器，如果不在writeExternal中写入i和s的值，那么反序列化之后s为null，i为0
     * @param x
     * @param a
     */
    public Blip3(String x,int a) {
        System.out.println("Blip3(String x, int a)");
        this.i=a;
        this.s=x;
    }

    public String toString() {
        return s + i;
    }

    /**
     * 明确序列化需要的部分
     * @param out
     * @throws IOException
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip3.writeExternal");
        out.writeInt(i);
        out.writeObject(s);
    }

    /**
     * 读取必须按照写入的序列化顺序，否则读取会报异常
     * @param in
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip3.readExternal");
        i = in.readInt();
        s = (String)in.readObject();
    }

    public static void main(String[] args) {
        System.out.println("Constructing objects:");
        Blip3 b3 = new Blip3("AString",47);
        System.out.println(b3);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("blip3.out"));
            out.writeObject(b3);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("blip3.out"));
            b3 = (Blip3)in.readObject();
            System.out.println(b3);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
