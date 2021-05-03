package com.kly.ants.thinking_in_java.object_contain_8.example7;

import java.util.Enumeration;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/2/28 10:59
 * @see
 */
public class StringSortTest {
    static class StringCompare implements Compare{

        @Override
        public boolean lessThan(Object lhs, Object rhs) {
            return ((String)lhs).compareToIgnoreCase((String)rhs) < 0; //按字典顺序比较两个字符串，不考虑大小写
        }

        @Override
        public boolean lessThanOrEqual(Object lhs, Object rhs) {
            return ((String)lhs).compareToIgnoreCase((String)rhs) <=0;
        }
    }

    public static void main(String[] args) {
        SortVector sv = new SortVector(new StringCompare());
        sv.addElement("d");
        sv.addElement("A");
        sv.addElement("C");
        sv.addElement("c");
        sv.addElement("b");
        sv.addElement("B");
        sv.addElement("D");
        sv.addElement("a");

        Enumeration e = sv.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        System.out.println("-------------------");
        sv.sort();

        e = sv.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
