package com.kly.ants.algorithm.sort.heapsort;

import java.util.Arrays;

/**
 * Description:构建的大根堆
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/12/15 20:54
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[]{7,1,3,10,5,2,8,9,6};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void heapSort(int[] array) {
        //构建大根堆
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjust(array, i, array.length);
        }
//        System.out.println(Arrays.toString(array));

        //循环删除栈顶元素
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[0]; //array[0]是最大值，首先删除，放在了数组的最后一个位置
            array[0] = temp;
            //
            downAdjust(array,0,i);//i的递减相当于删除操作
        }

    }

    public static void downAdjust(int[] array, int parentIndex, int length) {
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && array[childIndex] < array[childIndex + 1]) {
                childIndex++;
            }
            if (temp >= array[childIndex]) {
                break;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * parentIndex + 1;
        }
        array[parentIndex] = temp;
    }


}
