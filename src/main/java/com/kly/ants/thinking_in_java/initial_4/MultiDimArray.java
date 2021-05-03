package com.kly.ants.thinking_in_java.initial_4;

import java.util.Random;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/15 15:14
 * @see
 */
public class MultiDimArray {
    public static int pRand(int mod){
        Random rand = new Random();
        return Math.abs(rand.nextInt())%mod  +1;
    }

    public static void main(String[] args) {
        int[][] a1 = {{1,2,3},{2,3,4}};
        for (int[] i:a1) {
            for (int j : i) {
                System.out.println(j);
            }
        }
        int[][] a2 =  new int[3][2]; //行，列
        for (int[] i: a2) {
            for(int j : i) {
                System.out.println(j);
            }
        }
    }
}
