package com.kly.ants.Pattern.facade;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/4/13 16:31
 */
public class Screen {
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }


}
