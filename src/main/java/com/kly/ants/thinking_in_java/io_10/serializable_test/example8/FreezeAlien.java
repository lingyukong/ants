package com.kly.ants.thinking_in_java.io_10.serializable_test.example8;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  将Alien对象序列化到一个文件
 * @author kly
 * @Date 2018/4/18 9:58
 * @see
 */
public class FreezeAlien {
    public static void main(String[] args) throws Exception {
        ObjectOutput output = new ObjectOutputStream(new FileOutputStream("file.x"));
        Alien alien = new Alien();
        output.writeObject(alien);
    }
}
