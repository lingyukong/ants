package com.kly.ants.thinking_in_java.io_10.serializable_test.example9;

import java.io.*;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *   若不是特别在意要实现 Externalizable接口，还有另一种方法可供选用。我们可以实现 Serializable接
     口，并添加（注意是“添加”，而非“覆盖”或者“实现”）名为writeObject()和 readObject()的方法。
    一旦对象被序列化或者重新装配，就会分别调用那两个方法。也就是说，只要提供了这两个方法，就会优先
    使用它们，而不考虑默认的序列化机制。
 * @author kly
 * @Date 2018/4/19 9:24
 * @see
 */
public class SerialCtl implements Serializable {
    String a;
    transient String b;
    public SerialCtl(String aa, String bb) {
        a = "Not Transient: " + aa;
        b = "Transient: " + bb;
    }
    public String toString() {
        return a + ";" + b;
    }
    private void writeObject(ObjectOutputStream stream)
            throws IOException {
        stream.defaultWriteObject(); //控制是否写入序列化默认的字段（比如a）
        stream.writeObject(b); //尽管b为transient，但是此处明确写入，还是会被序列化
    }
    private void readObject(ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        b = (String)stream.readObject();
    }
    public static void main(String[] args) {
        SerialCtl sc = new SerialCtl("Test1", "Test2");
        System.out.println("Before:" + sc);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        try {
            ObjectOutputStream o = new ObjectOutputStream(buf);
            o.writeObject(sc);

            // Now get it back:
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(
                                    buf.toByteArray()));
            SerialCtl sc2 = (SerialCtl)in.readObject();
            System.out.println("After:" + sc2);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
