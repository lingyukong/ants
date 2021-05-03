package com.kly.ants.algorithm.recursion;

/**
 * Description:
 * Company:changyou
 *   计算n的阶乘
 * @author konglingyu
 * @Date 2019/12/31 17:56
 */
public class Factorial {
    /**
     * 定位方法的含义：factorial(n) 表示n个阶乘的乘积是多少
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
