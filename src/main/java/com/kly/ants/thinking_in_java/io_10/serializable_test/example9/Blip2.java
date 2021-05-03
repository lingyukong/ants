package com.kly.ants.thinking_in_java.io_10.serializable_test.example9;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/18 10:35
 * @see
 */
public class Blip2 implements Externalizable {

    public Blip2() {
        System.out.println("Blip2 Constructor");
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip2.writeExternal");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip2.readExternal");
    }
}
