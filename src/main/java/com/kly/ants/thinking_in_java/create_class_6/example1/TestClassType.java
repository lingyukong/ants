package com.kly.ants.thinking_in_java.create_class_6.example1;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/28 13:51
 * @see
 */
public class TestClassType {
    public TestClassType() {
        System.out.println("构造函数初始化");
    }

    static {
        System.out.println("静态模块初始化");
    }

    {
        System.out.println("非静态参数初始化");
    }
}
