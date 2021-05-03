package com.kly.ants.thinking_in_java.io_10.serializable_test.example7;

import java.io.Serializable;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/17 14:45
 * @see
 */
public class Data implements Serializable {
    private int i;
    public Data(int x) {
        i=x;
    }
    public String toString() {
        return Integer.toString(i);
    }

}
