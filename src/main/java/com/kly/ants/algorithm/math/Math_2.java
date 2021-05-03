package com.kly.ants.algorithm.math;

/**
 * Description:
 * Company:changyou
 *   1  ~ n整数中，1出现的次数
 * @author konglingyu
 * @Date 2020/5/14 16:59
 */
public class Math_2 {

    // 解法1  时间复杂度是O(N*logN)
    public static int  NumberOf1Between1AndN_Solution(int n)
    {
        int count = 0;
        for(int i = 1;i <= n;i++){
            int temp = i;
            while(temp != 0) {
                if(temp % 10 == 1){
                    count++;
                }
                temp  = (int) Math.floor(temp/10);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(Math_2.NumberOf1Between1AndN_Solution(11));
    }
}
