package com.kly.ants.algorithm.recursion;

/**
 * Description:
 * Company:changyou
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 * @author konglingyu
 * @Date 2019/12/31 18:25
 */
public class jumpFloor {


    /**
     * 定位方法的含义：jumpFloor(n) 表示n个台阶一共有多少种跳法
     * @param n
     * @return
     */
    public static int jumpFloor(int n){
        if (n <= 0) {
            return 0;
        }
        if(n <= 2) {
            return n;
        }
        return jumpFloor(n-1) + jumpFloor(n-2);
    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(10));
    }
}
