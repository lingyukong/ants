package com.kly.ants.algorithm.math;

/**
 * Description:
 * Company:changyou
 * 求两个整数的最大公约数，要求性能尽可能的好
 *
 * @author konglingyu
 * @Date 2020/2/19 10:25
 */
public class Divisor {
    public static void main(String[] args) {
//        System.out.println(60 / 24);
//        System.out.println(60 % 24);
        System.out.println(3 << 1);
//        System.out.println(3 / 1);
        System.out.println(commonDivisor1(3, 7));
        System.out.println(commonDivisor2(24, 60));
        System.out.println(commonDivisor3(24, 60));
    }

    /**
     * 欧几里得算法（辗转相除法）
     *
     * @param a
     * @param b
     * @return
     */
    public static int commonDivisor1(int a, int b) {
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        if (max % min == 0) {
            return min;
        }
        return commonDivisor1(max % min, min);
    }

    /**
     * 更相减损术
     *
     * @param a
     * @param b
     * @return
     */
    public static int commonDivisor2(int a, int b) {
        if (a == b) {
            return a;
        }
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        return commonDivisor2(max - min, min);
    }


    public static int commonDivisor3(int a, int b) {
       if(a == b) {
           return a;
       }
       if((a&1)==0 && (b&1) ==0) {
           return commonDivisor3(a>>1,b>>1)<<1;
       }else if((a&1)==0 && (b&1)!=0) {
           return commonDivisor3(a>>1,b);
       } else if((a&1) != 0 && (b&1) ==0) {
           return  commonDivisor3(a,b>>1);
       } else  {
           int max = a>b ? a:b;
           int min= a<b ? a:b;
           return commonDivisor3(max-min ,min);
       }
    }
}
