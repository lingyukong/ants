package com.kly.ants.Pattern.singleton;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/15 9:33
 */
public class DoubleCheckedSingleton {

    /**
     * 如果不加关键字volatile，则instance可能会通过指令重排序l，返回nul的instance
     */
    private static volatile DoubleCheckedSingleton instance;
    private DoubleCheckedSingleton(){

    }

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
