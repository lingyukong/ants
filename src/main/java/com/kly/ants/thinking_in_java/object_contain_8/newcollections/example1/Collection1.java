package com.kly.ants.thinking_in_java.object_contain_8.newcollections.example1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  注意Collectionsl类在实际中的使用
 * @author kly
 * @Date 2018/2/28 15:42
 * @see
 */
public class Collection1 {
    public static Collection fill(Collection c ,int start, int size) {
       for (int i=start;i<start + size;i++) {
           c.add(Integer.toString(i));
       }
       return c;
    }

    public static Collection fill(Collection c,int size) {
        return fill (c,0,size);
    }

    public static Collection fill(Collection c) {
        return fill(c,0,10);
    }


    public static Collection newCollection() {
        return fill(new ArrayList());
    }

    public static Collection newCollection(int start,int size) {
        return fill(new ArrayList(),start,size);
    }

    public static void print(Collection c) {
        Iterator x = c.iterator();
        while(x.hasNext()) {
            System.out.print(x.next() + " ");
        }

//        for(Iterator x = c.iterator(); x.hasNext();) {
//            System.out.print(x.next() + " ");
//        }
        System.out.println();
    }

    public static void main(String[] args) {
        Collection c = newCollection();
        c.add("ten");
        c.add("eleven");
        print(c);

        // Make an array from the List:
        Object[] array = c.toArray();
        // Make a String array from the List:
        String[] str =
                (String[])c.toArray(new String[1]);
        // Find max and min elements; this means
        // different things depending on the way
        // the Comparable interface is implemented:
        System.out.println("Collections.max(c) = " + Collections.max(c));
        System.out.println("Collections.min(c) = " + Collections.min(c));
        // Add a Collection to another Collection
        c.addAll(newCollection());
        print(c);
        c.remove("3"); // Removes the first one 从此 collection 中移除指定元素的单个实例，如果存在的话
        print(c);
        c.remove("3"); // Removes the second one
        print(c);
        // Remove all components that are in the
        // argument collection:
        c.removeAll(newCollection()); //移除此 collection 中那些也包含在指定 collection 中的所有元素
        print(c);
        c.addAll(newCollection());
        print(c);
        // Is an element in this Collection?
        System.out.println(
                "c.contains(\"4\") = " + c.contains("4"));
        // Is a Collection in this Collection?
        System.out.println(
                "c.containsAll(newCollection()) = " +
                        c.containsAll(newCollection()));
        Collection c2 = newCollection(5, 3);
        // Keep all the elements that are in both
        // c and c2 (an intersection of sets):
        c.retainAll(c2); //仅保留此 collection 中那些也包含在指定 collection 的元素
        print(c);
        // Throw away all the elements in c that
        // also appear in c2:
        c.removeAll(c2);
        System.out.println("c.isEmpty() = " +
                c.isEmpty());
        c = newCollection();
        print(c);
        c.clear(); // Remove all elements
        System.out.println("after c.clear():");
        print(c);
    }
}
