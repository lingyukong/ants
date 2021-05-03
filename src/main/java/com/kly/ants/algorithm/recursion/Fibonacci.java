package com.kly.ants.algorithm.recursion;

/**
 * Description:
 * Company:changyou
 *     斐波那契数列的是这样一个数列：1、1、2、3、5、8、13、21、34....，即第一项 f(1) = 1,第二项 f(2) = 1.....,第 n 项目为 f(n) = f(n-1) + f(n-2)。求第 n 项的值是多少
 * @author konglingyu
 * @Date 2019/12/31 18:05
 */
public class Fibonacci {


    /**
     * 定位方法的含义：fibonacci(n) 表示第n个数据的值
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if(n <= 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }


}
