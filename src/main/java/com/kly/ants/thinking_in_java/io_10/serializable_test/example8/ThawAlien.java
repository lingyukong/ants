package com.kly.ants.thinking_in_java.io_10.serializable_test.example8;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 * 从文件file.x 反序列化对象Alien
 * Serializable 的反序列化不会调用默认构建器，与Externalizable不同，
 * @author kly
 * @Date 2018/4/18 10:09
 * @see
 */
public class ThawAlien {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.x"));
        Object object= in.readObject();
        System.out.println(object.getClass().toString());
    }
}
