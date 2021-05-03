package com.kly.ants.Pattern.facade;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/4/13 16:30
 */
public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Projector on ");
    }


    public void off() {
        System.out.println(" Projector ff ");
    }

    public void focus() {
        System.out.println(" Projector is Projector	");
    }

}
