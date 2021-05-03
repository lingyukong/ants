package com.kly.ants.Pattern.singleton;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/15 9:51
 */
public enum EnumSingleton {
    INSTANCE;

    private EnumSingleton(){

    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public void doSometing() {
        System.out.println("comn in enum");
    }


    public  void main(String[] args) {
       EnumSingleton.getInstance().doSometing();
    }
}
