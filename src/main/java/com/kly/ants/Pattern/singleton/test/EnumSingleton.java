package com.kly.ants.Pattern.singleton.test;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/16 8:15
 */
public enum EnumSingleton {
   INSTANCE;

   public static EnumSingleton getInstance() {
        return INSTANCE;
   }
}
