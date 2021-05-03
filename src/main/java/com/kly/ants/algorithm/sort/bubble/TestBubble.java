package com.kly.ants.algorithm.sort.bubble;

import java.util.Arrays;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/12/30 12:09
 */
public class TestBubble {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 5, 7, 8, 7, 4};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) {
               break;
            }
        }
    }
}
