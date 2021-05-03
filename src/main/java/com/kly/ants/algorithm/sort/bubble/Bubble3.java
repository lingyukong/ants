package com.kly.ants.algorithm.sort.bubble;

import java.util.Arrays;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/10 20:21
 */
public class Bubble3 {
    public static void sort(int[] array) {
        int lastIndex = 0;
        int sortedlength = array.length - 1;
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < sortedlength; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    isSorted = false;
                    lastIndex = j;
                }
            }
            sortedlength = lastIndex;
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
//        int[] array = new int[]{5,8,6,3,9,2,1,7};
        int[] array = new int[]{3, 4, 2, 1, 5, 6, 7, 8};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
