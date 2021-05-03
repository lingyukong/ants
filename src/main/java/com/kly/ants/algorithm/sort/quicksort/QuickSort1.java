package com.kly.ants.algorithm.sort.quicksort;

import java.util.Arrays;

/**
 * Description:
 * Company:changyou
 *  填坑法，，递归实现
 *  给定原始数列如下，要求从小到大排序，填坑法
 * @author konglingyu
 * @Date 2020/12/9 19:57
 */
public class QuickSort1 {

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,6,5,3,2,8,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }



    public static void quickSort(int[] arr,int startIndex,int endIndex) {
        //递归结束条件
        if(startIndex >= endIndex) {
            return;
        }
        //返回基准元素排序后所在的位置（即二分法的分界点）
        int pivotIndex = partition(arr,startIndex,endIndex);
//       System.out.println("pivotIndex=" + pivotIndex  + "--startIndex=" + startIndex + "--endIndex=" + endIndex);
        //用递分治法归数列的两部分
        quickSort(arr,startIndex,pivotIndex-1);
        quickSort(arr,pivotIndex +1 ,endIndex);
    }

    //返回基准元素排序后在数列中所在的位置，之后以该位置为分隔，使用二分法继续选择基准元素进行交换
    public static int  partition(int[] arr,int startIndex,int endIndex){
        //取第一个位置的元素作为基准元素
        int pivot = arr[startIndex];
        //设置2个指针，指向数列的最左和最右两个元素
        int left = startIndex;
        int right = endIndex;
        //设置坑的指针，默认指向基准元素的位置，
        int index = startIndex;

        while(right >= left) {// 左右指针循环交换元素之后，只要指针没重合，要继续进行交换，直至重合，本次对比交换才算结束
            while(right>=left) {  //控制右指针的循环
//                System.out.println("小循环" + Arrays.toString(arr));
                if(arr[right] < pivot) { //只要元素交换了一次位置，本次循环就结束，否则右指针向左移动一次
                    arr[left] = arr[right];
                    index = right;
                    left ++;
                    break;
                }
                right--;
            }

            while(right>=left) {//控制左指针的循环
                if(arr[left] > pivot) {////只要元素交换了一次位置，本次循环就结束，否则左指针向右移动一次
                    arr[right] = arr[left];
                    index = left;
                    right --;
                    break;
                }
                left++;
            }
        }

        //左右指针重合之后，将坑的位置填上基准元素,返回基准元素所在的位置，用于下次二分比较的时候使用
        arr[index] = pivot;
        return index;
    }

}
