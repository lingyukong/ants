package com.kly.ants.thinking_in_java.io_10.serializable_test.example9;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  序列化的控制(Externalizable),Externalizable 默认时不保存对象的任何字段
 *  如果要序列化控制的对象构造器不是public的，那么在恢复的时候会报no valid constructor 异常。
 *  是因为Externalizable 的序列化与恢复一个Serializable（可序列化）对象不同。在后者的情况
     下，对象完全以它保存下来的二进制位为基础恢复，不存在默认构建器调用（其他带参数的构建器不会被调用）。而对一个Externalizable 对象，所
     有普通的默认构建行为都会发生（包括在字段定义时的初始化），而且会调用readExternal()。必须注意这
     一事实——特别注意所有默认的构建行为都会进行——否则很难在自己的 Externalizable 对象中产生正确的
     行为。
 * @author kly
 * @Date 2018/4/18 10:32
 * @see
 */
public class Blip1 implements Externalizable {

    public Blip1() {
        System.out.println("Blip1 Constructor");
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip1.writeExternal");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip1.readExternal");
    }
}
