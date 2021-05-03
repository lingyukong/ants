package com.kly.ants.thinking_in_java.initial_4;

/**
 * <p>Description: 初始化顺序</p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/15 11:51
 * @see
 */
public class Card {
    Tag t1 = new Tag(1);

    public Card() {
        System.out.println("Card()");
        t3 = new Tag(33);
    }
    Tag t2 = new Tag(2);

    public void f() {
        System.out.println("f()");
    }

    Tag t3 =  new Tag(3);
}
