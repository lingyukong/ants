package com.kly.ants.Pattern.singleton;

/**
 * Description: 饿汉式单例模式
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/15 8:54
 */
public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton() {

    }

    public static HungerSingleton getInstance() {
        return instance;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(HungerSingleton.getInstance().hashCode());
        }
    }

}
