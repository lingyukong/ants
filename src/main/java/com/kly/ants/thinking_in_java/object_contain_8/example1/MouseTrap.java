package com.kly.ants.thinking_in_java.object_contain_8.example1;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/23 9:50
 * @see
 */
public class MouseTrap {
    static void caughtYa(Object m) {
        Mouse mouse = (Mouse)m; // Cast from Object
        mouse.print("Caught one!");
    }
}
