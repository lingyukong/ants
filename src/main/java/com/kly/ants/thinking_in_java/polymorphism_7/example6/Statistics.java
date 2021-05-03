package com.kly.ants.thinking_in_java.polymorphism_7.example6;

import java.util.Hashtable;

/**
 * <p>Description:
 * 所有集合能容纳的仅有对象句柄，所以根本不可以使用整数
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/24 16:17
 * @see
 */
public class Statistics {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        for (int i=0;i<10000;i++) {
            Integer r = new Integer((int)(Math.random()*20));
            if (ht.containsKey(r)) {
                ((Counter)ht.get(r)).i++;
            } else {
                ht.put(r,new Counter());
            }
        }
        System.out.println(ht);

    }
}
