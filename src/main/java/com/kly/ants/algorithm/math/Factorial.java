package com.kly.ants.algorithm.math;

/**
 * Description:
 * Company:changyou
 *  求一个整数的阶乘末尾0的个数
 * @author konglingyu
 * @Date 2021/3/4 18:28
 */
public class Factorial {
    public static long  factorial(int n) {
        if(n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }

    private static int countDivisor(int num,int divisor) {
        //统计个数
        int temp = 0;
        for (int i = 0; i < num; i++) {
            if (num % divisor == 0) {
                num /= divisor;
                temp++;
            } else {
                break;
            }

        }
        return temp;
    }

    public static void getZeroInFactorial(int num) {
        int count2 = 0;
        int count5 = 0;
        for (int i = 1; i <= num; i++) {
            count2 += countDivisor(i, 2);
            count5 += countDivisor(i, 5);
        }
        System.out.println(count2 +"-------" +count5);
        System.out.println(factorial(num));
        System.out.println(num + "的阶乘末尾有" + (count2 > count5 ? count5 : count2) + "个0！");
    }

    public static void main(String[] args) {
        System.out.println("countDivisor=" + countDivisor(40,2));
        getZeroInFactorial(18);
    }

}
