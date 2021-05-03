package com.kly.ants.thinking_in_java.object_contain_8.example6;



import com.kly.ants.thinking_in_java.object_contain_8.example1.Mouse;

import java.util.Hashtable;
import java.util.Vector;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  这里演示的是Enumeration（枚举）的真正威力，将一个序列的操作与那个序列的基础结构分隔开
 *  由于 Enumeration隐藏了基层集合的结构，所以PrintData 不知道或者不关心Enumeration 来自于什么类型的集合
 * @author kly
 * @Date 2018/2/27 16:43
 * @see
 */
public class Enumerators2 {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i=0;i<5;i++) {
            v.addElement(new Mouse(i));
        }

        Hashtable ht = new Hashtable();
        for (int i=0;i<5;i++) {
            ht.put(new Integer(i),new Hamster(i));
        }

        System.out.println("Vector");
        PrintData.print(v.elements());
        System.out.println("Hashtable");
        PrintData.print(ht.elements());
    }
}
