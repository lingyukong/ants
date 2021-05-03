package com.kly.ants.algorithm.sort.countSort;

import java.util.Arrays;

/**
 * Description:
 * Company:changyou
 * 计数排序
 * 采用偏移量的方式，解决数据过大的问题，采以（数列最大值和最小值的差+1）作为统计数组的长度,同时，数列的最小值作为一个偏移量，用于统计数组的对号入座
 * @author konglingyu
 * @Date 2021/1/4 20:13
 */
public class CountSort {
    public static void main(String[] args) {
        int[] array = new int[]{95, 94, 91, 98, 99, 93, 91, 92};
        System.out.println(Arrays.toString(array));
        int[] sortedArray = countSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] countSort(int[] array) {
        //得到数列的最大值和最小值，并计算出差值
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int d = max - min;
        //创建统计数组并统计对应元素个数，相当于已经排好序了，只是没有指定具体的位置
        int[] countArray = new int[d + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }
        System.out.println(Arrays.toString(countArray));
        //对统计数组做升级，后面的元素等于前面元素之和，升级之后的数组元素值就是 排序后的数据所在位置
        int sum = 0;
        for (int i = 0; i < countArray.length; i++) {
            sum += countArray[i];
            countArray[i] = sum;
        }
        System.out.println(Arrays.toString(countArray));

        //倒序遍历原始数列，从统计数组找到正确位置（成为稳定排序），输出到结果数组
        int[] sortedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            sortedArray[countArray[array[i] - min] -1] = array[i];  //如果实际位置是3，那么数组下标需要-1操作
            countArray[array[i] - min]--; //统计数组中的数值要减1操作
        }
        return sortedArray;
    }


}
