package com.kly.ants.thinking_in_java.initial_4;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/15 14:30
 * @see
 */
public class Arrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b ;
        b = a;
        for (int i:b) {
            System.out.println(i);
        }
        for (int j:a) {
            System.out.println(j);
        }
    }
}
