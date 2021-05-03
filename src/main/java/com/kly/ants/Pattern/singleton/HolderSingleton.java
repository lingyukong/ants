package com.kly.ants.Pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/15 9:46
 */
public class HolderSingleton {

    private HolderSingleton() {

    }

    private static class Holder {
        private static HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.instance;
    }


    public static void main(String[] args) throws Exception {
        Constructor con = HolderSingleton.class.getDeclaredConstructor();
        con.setAccessible(true);
        HolderSingleton holderSingleton1 = (HolderSingleton)con.newInstance();
        HolderSingleton holderSingleton2= (HolderSingleton)con.newInstance();
        System.out.println(holderSingleton1.equals(holderSingleton2));
    }
}
