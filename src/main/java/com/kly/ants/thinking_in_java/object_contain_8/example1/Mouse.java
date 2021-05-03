package com.kly.ants.thinking_in_java.object_contain_8.example1;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/23 9:50
 * @see
 */
public class Mouse {
    private int mouseNumber;
    public Mouse(int i) {
        mouseNumber = i;
    }
    // Magic method:
    public String toString() {
        return "This is Mouse #" + mouseNumber;
    }
    void print(String msg) {
        if(msg != null) System.out.println(msg);
        System.out.println(
                "Mouse number " + mouseNumber);
    }
}
