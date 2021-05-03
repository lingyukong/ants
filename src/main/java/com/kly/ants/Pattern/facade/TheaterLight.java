package com.kly.ants.Pattern.facade;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/4/13 16:33
 */
public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" TheaterLight on ");
    }


    public void off() {
        System.out.println(" TheaterLight off ");
    }


    public void dim() {
        System.out.println(" TheaterLight dim.. ");
    }

    public void bright() {
        System.out.println(" TheaterLight bright.. ");
    }

}
