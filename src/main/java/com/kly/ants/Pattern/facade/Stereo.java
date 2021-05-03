package com.kly.ants.Pattern.facade;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/4/13 16:32
 */
public class Stereo {
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Stereo on ");
    }


    public void off() {
        System.out.println(" Screen off ");
    }

    public void up() {
        System.out.println(" Screen up.. ");
    }

}
