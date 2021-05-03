package com.kly.ants.thinking_in_java.object_contain_8.newcollections.example3;



import com.kly.ants.thinking_in_java.object_contain_8.newcollections.example1.Collection1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/3/5 18:30
 * @see
 */
public class Set1 {

    public static void testVisual(Set a) {
        Collection1.fill(a);
        Collection1.fill(a);
        Collection1.fill(a);
        Collection1.print(a); // No duplicates!


        // Add another set to this one:
        a.addAll(a);
        a.add("one");
        a.add("one");
        a.add("one");
        Collection1.print(a);

        // Look something up:
        System.out.println("a.contains(\"one\"): " +
                a.contains("one"));
    }
    public static void main(String[] args) {
        testVisual(new HashSet());
        testVisual(new TreeSet());
    }
}
