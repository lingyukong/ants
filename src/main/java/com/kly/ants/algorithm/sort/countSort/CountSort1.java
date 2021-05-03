package com.kly.ants.algorithm.sort.countSort;

import java.util.Arrays;

/**
 * Description:
 * Company:changyou
 * 原始：计数排序(朴素版)
 *
 * 对于这个算法10以内的数据可以，若数字过大，造成数组空间的浪费
 * 以（输入数列的最大值+1）作为统计数组的长度
 *
 * @author konglingyu
 * @Date 2021/1/5 16:15
 */
public class CountSort1 {
    public static void main(String[] args) {
        int[] array = new int[]{3,5,7,2,6,8,1,9};
//        int[] array = new int[]{4,4,6,5,3,2,8,1,7,5,6,0,10};
        System.out.println(Arrays.toString(countSort(array)));
    }

    public static int[] countSort(int[] array) {
        int max = array[0];
        //找到数列的最大整数
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        //统计数组
        int[] countArray = new int[max+1];

        for(int i=0;i<array.length;i++) {
            countArray[array[i]]++;
        }
        System.out.println(Arrays.toString(countArray));

        //将统计数组输出
        int index = 0;
        int[] sortArray = new int[array.length];
        for(int i=0;i<countArray.length;i++) {
            for(int j=0;j<countArray[i];j++) {  //对统计数组的值也要进行遍历，处理多个相同元素的情况
                sortArray[index++] = i;
            }
        }

        return sortArray;
    }
}
