package com.kly.ants.algorithm.recursion;

/**
 * Description:
 * Company:changyou
 *  一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 * @author konglingyu
 * @Date 2020/1/2 18:30
 */
public class JumpFloor2 {

    public static int jumpfloor2(int n) {
        if(n <= 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return 2*jumpfloor2(n-1);
    }

    public static void main(String[] args) {
        System.out.println(jumpfloor2(3));
    }
}
