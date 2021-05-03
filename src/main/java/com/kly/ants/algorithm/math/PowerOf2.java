package com.kly.ants.algorithm.math;

/**
 * Description:
 * 判断一个整数是否是2的整数次幂，要求时间复杂度为O(1)
 * <p>
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/18 16:59
 */
public class PowerOf2 {
    /**
     * 性能最好的方案，按位运算
     * @param num
     * @return
     */
    public static boolean isPowerOf2(int num) {
      return (num&(num-1)) == 0;
    }


    /**
     * 我想到的一种递归方案，实现不了，因为递归的结束条件不成立
     */

    public static int isPowerOf2Recursion(int num) {
        System.out.println(num);
/*        if(num < 2) {
            return 0;
        }*/
        if (num == 2) {
            return 1;
        }
        return isPowerOf2Recursion(num/2);
    }

    /**
     * 乘积的方法
     * @param num
     * @return
     */
    public static boolean isPowerOf3(int num) {
        int temp = 1;
        while(temp <= num) {
            if (temp == num) {
                return true;
            }
            temp = 2*temp;
        }
        return false;
    }




    public static void main(String[] args) {
        System.out.println(isPowerOf2(1024));
//        System.out.println(isPowerOf2Recursion(isPowerOf2Recursion(2)));
        System.out.println(isPowerOf3(1024));
    }
}
