package com.kly.ants.Pattern.singleton.test;

import java.lang.reflect.Constructor;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/16 8:11
 */
public class HolderSingleton {

    private HolderSingleton() {}

    private static class Holder {
        private static HolderSingleton instance = new HolderSingleton();
    }


    public static HolderSingleton getInstance() {
        return Holder.instance;
    }


    public static void main(String[] args) throws Exception {
        Constructor cons = HolderSingleton.class.getDeclaredConstructor();
        cons.setAccessible(true);
        HolderSingleton holderSingleton = (HolderSingleton) cons.newInstance();
        HolderSingleton holderSingleton1 = (HolderSingleton) cons.newInstance();
        System.out.println(holderSingleton.equals(holderSingleton1));
    }


}
