package com.kly.ants.algorithm.sort.bubble;

import java.util.Arrays;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/10 20:02
 */
public class Bubble2 {

    public static void sort(int[] array) {

        for(int i =0;i<array.length-1;i++) {
//            System.out.println(i);
            Boolean isSorted = true;
            for (int j=0;j<array.length - 1 -i ;j++) {
                System.out.println("i="+ i + "---" + j);
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSorted = false; //如果没有元素交换，根据标志位结束之后的循环
                }
            }
            if(isSorted) {
                break;
            }

        }
    }

    public static void main(String[] args) {
//        int[] array = new int[]{5,8,6,3,9,2,1,7};
        int[] array = new int[]{3,4,2,1,5,6,7,8};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
