package com.kly.ants.thinking_in_java.object_contain_8.example2;

import java.util.Enumeration;
import java.util.Vector;

/**
 * <p>Description: 枚举器，Enumeration
 * 使用Enumeration，我们不必关心集合中的元素数量。所有工作均由 hasMoreElements()和nextElement()自动照管了
 * </p>
 *
 *
 * @author kly
 * @Date 2018/1/23 10:03
 * @see
 */
public class CatsAndDogs2 {
    public static void main(String[] args) {
        Vector cats = new Vector();
        for (int i=0;i<7 ;i++) {
            cats.addElement(new Cats2(i));
        }
        cats.addElement(new Dog2(7));

        //使用枚举读取元素
        Enumeration e = cats.elements();
        while (e.hasMoreElements()) {
            ((Cats2)e.nextElement()).print();
        }

        //原始读取元素
//        for (int i=0;i<cats.size() ;i++) {
//            ((Cats2)cats.elementAt(i)).print();
//        }

    }
}
