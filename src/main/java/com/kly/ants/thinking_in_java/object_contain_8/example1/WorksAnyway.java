package com.kly.ants.thinking_in_java.object_contain_8.example1;

import java.util.Vector;

/**
 * <p>Description:
 * Java 提供了四种类型的“集合类”：Vector（矢量）、BitSet（位集）、Stack（堆栈）以及Hashtable（散列表）
 * 1:Vector 类可以实现可增长的对象数组
 * 2:多个线程操作一个BitSet是不安全的
 * 3：Vector是由数组实现的集合类，他包含了大量集合处理的方法

   矢量：既有大小又有方向的量
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/23 9:51
 * @see thinking_in_java.object_contain_8.example3.Bits
 * @see thinking_in_java.object_contain_8.example4.Stacks
 */
public class WorksAnyway {

    public static void main(String[] args) {
        Vector mice = new Vector();
        for(int i = 0; i < 3; i++)
            mice.addElement(new Mouse(i));
        for(int i = 0; i < mice.size(); i++) {
        // No cast necessary, automatic call
        // to Object.toString():
            System.out.println(
                    "Free mouse: " + mice.elementAt(i));
            MouseTrap.caughtYa(mice.elementAt(i));
        }
    }
}

