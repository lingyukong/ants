package com.kly.ants.thinking_in_java.object_contain_8.example6;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/2/27 16:49
 * @see
 */
public class Hamster {
    private int hamsterNumber;
    Hamster(int i) {
        hamsterNumber = i;
    }
    public String toString() {
        return "This is Hamster #" + hamsterNumber;
    }
}
