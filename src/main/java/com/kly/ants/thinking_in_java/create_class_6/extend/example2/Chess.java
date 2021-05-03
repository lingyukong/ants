package com.kly.ants.thinking_in_java.create_class_6.extend.example2;

/**
 * <p>Description: 在衍生类构建器中，对基础类构建器的调用是必须做的第一件事情</p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/18 14:26
 * @see
 */
public class Chess extends BoardGame {

    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
