package com.kly.ants.thinking_in_java;

import java.util.Properties;

public class Object {
    public static int num; //类变量（静态变量）
    public double d; //实例变量



    public static void main(String[] args) {
        int n = 1; //局部变量
        Object ob = new Object(); //创建实例
        System.out.println(n);
        System.out.println(ob.d);
        System.out.println(Object.num);

        System.out.println("关系运算符---------------------------------");
        /**
         * 关系运算符
         */
        Integer in1 = new Integer(18);
        Integer in2 = new Integer(18);
        Integer in3 =  new Integer(16);

        System.out.println(in1 == in2);
        System.out.println(in1.equals(in2)); //true 主类型直接比较的是值，保留
        System.out.println(in3 < in2);

        System.out.println("---------------------------------");

        Object ob1 = new Object();
        Object ob2 = new Object();
        ob1.num = ob2.num = 18;

        System.out.println(ob1.equals(ob2)); //false  对象比较的还是句柄
        System.out.println(ob1.num == ob2.num);

        System.out.println("移位运算符----------------------------------");
        int i= 10;
        System.out.println(Integer.toBinaryString(-8));
        System.out.println(i << 2); //i* 2^2
        System.out.println(i >> 2); // i* 2^-2


        System.out.println("进制----------------------------------------");
        int a  = 01247;
        System.out.println(a);


        System.out.println("获取系统属性");
        Properties property = System.getProperties();
        property.list(System.out);
        System.out.println(1 << 4);
    }
}
