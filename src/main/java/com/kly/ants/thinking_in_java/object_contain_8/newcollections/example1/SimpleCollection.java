package com.kly.ants.thinking_in_java.object_contain_8.newcollections.example1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  Iterator:迭代器
 *  迭代器取代了 Java Collections Framework 中的 Enumeration。迭代器与枚举有两点不同：
 *  1:迭代器允许调用者利用定义良好的语义在迭代期间从迭代器所指向的 collection 移除元素。
    2:方法名称得到了改进(hasNext()代替了 hasMoreElement()，而 next()代替了nextElement()。)
 * @author kly
 * @Date 2018/2/28 15:24
 * @see
 */
public class SimpleCollection {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        for (int i=0;i<10;i++) {
            c.add(i);
        }

        c.add(9);
        Iterator it = c.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------");
        Object[] array = c.toArray();
        for (Object o : array) {
            System.out.println(o);
        }
    }
}
