package com.kly.ants.algorithm.sort.bubble;


import java.util.Arrays;

/**
 * Description:
 * Company:changyou
 *  冒泡排序
 *  使用双循环
 * @author konglingyu
 * @Date 2020/1/9 22:47
 */
public class BubbeSimple {

    public static void sort(int[] array){
        for (int i=0; i<array.length-1 ; i++){
//            System.out.println(i);
            for(int j=0; j< array.length - 1 - i;j++) {  //i表示有序区的个数
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
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
