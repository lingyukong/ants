package com.kly.ants.Pattern.singleton.test;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/16 8:10
 */
public class DoubleCheckedSingleton {
   private static volatile DoubleCheckedSingleton instance;
   private DoubleCheckedSingleton(){};

   public static DoubleCheckedSingleton getInstance() {
       if(null == instance) {
            synchronized (DoubleCheckedSingleton.class){
                if(null == instance) {
                    instance = new DoubleCheckedSingleton();
                }
            }
       }
       return instance;
   }
}
