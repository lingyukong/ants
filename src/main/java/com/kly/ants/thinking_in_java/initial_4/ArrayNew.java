package com.kly.ants.thinking_in_java.initial_4;

import java.util.Random;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/15 14:37
 * @see
 */
public class ArrayNew {

    public static int pRand(int mod){
        Random rand = new Random();
        return Math.abs(rand.nextInt())%mod  +1;
    }

    public static void main(String [] args) {
        int[] a;
        a = new int[pRand(20)];
        System.out.println("a.length=" + a.length);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
