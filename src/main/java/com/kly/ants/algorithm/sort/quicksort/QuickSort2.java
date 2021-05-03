package com.kly.ants.algorithm.sort.quicksort;

import java.util.Arrays;

/**
 * Description:
 * Company:changyou
 * 指针交换法-递归实现
 * @author konglingyu
 * @Date 2020/12/10 19:59
 */
public class QuickSort2 {

    public static void main(String[] args) {
//        int[] arr = new int[]{1,7,6,5,3,2,8,4};
        int[] arr = new int[]{3,4,7,4,5,6,9};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int startIndex ,int endIndex) {
        if(startIndex >= endIndex){
            return;
        }
        int pivot = partition(arr,startIndex,endIndex);
        quickSort(arr,0,pivot-1);
        quickSort(arr,pivot+1,endIndex);
    }

    public static int partition(int[] arr,int startIndex,int endIndex) {
        int pivot = arr[startIndex];
        int left = startIndex; //left指针永远指向比基准元素大的，如果比基准元素小，就会向右移动
        int right = endIndex; //right指针永远指向比基准元素小的，如果比基准元素大，就会向左移动


        while(left < right) {

            while(left < right && arr[right] > pivot) {
                right--;
            }

            while(left < right && arr[left] <= pivot) {
                left ++;
            }
            //进行指针元素交换，交换元素后，重新进行循环比较
            if(right >= left) {
                int p = arr[right];
                arr[right] = arr[left];
                arr[left] = p;
            }
        }
        //重合元素的位置一定是基准元素的位置，进行交换
         int temp = arr[left];
         arr[left] = arr[startIndex]; //将left和right重合元素同基准元素交换
         arr[startIndex] = temp;

         return left;

    }


}
