package com.kly.ants.Pattern.singleton.test;

/**
 * Description:
 * Company:changyou
 * 饿汉式
 * @author konglingyu
 * @Date 2020/3/16 8:06
 */
public class HungerSingleton {
      private static HungerSingleton instance = new HungerSingleton();

      private HungerSingleton() {

      }

      public static HungerSingleton getInstance() {
            return instance;
      }
}
