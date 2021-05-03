package com.kly.ants.thinking_in_java.initial_4;

import java.util.Random;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/15 15:02
 * @see
 */
public class ArrayClassObj {
    public static int pRand(int mod){
        Random rand = new Random();
        return Math.abs(rand.nextInt())%mod  +1;
    }

    public static void  main(String[] args) {
        Integer[] a = new Integer[pRand(20)];
        System.out.println("a.length=" + a.length);
        for (int i=0;i<a.length;i++) {
            a[i] = pRand(20);

        }
        for (int j: a) {
            System.out.println(j);
        }
    }
}
