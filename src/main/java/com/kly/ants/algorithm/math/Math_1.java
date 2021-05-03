package com.kly.ants.algorithm.math;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Description:
 * Company:changyou
 *  输入n个整数，找出其中最小的k个数，例如4 ,5,1,6,2,7,3,8   则最小的4个数字是，1，2,3,4
 * @author konglingyu
 * @Date 2020/5/14 15:44
 */
public class Math_1 {

    public static ArrayList<Integer> getLeastNumbers (int[] input , int k) {
        ArrayList<Integer>  result = new ArrayList<Integer>();

        int length = input.length;
        if(k > length || k == 0) {
            return result;
        }

        /**
         *    降序：(x,y) -> y-x
         *    升序：(x,y) -> x-y
         */

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((x,y) -> y-x);

        for(int i = 0; i < k; i++) {
            maxHeap.offer(input[i]);
        }
        for(int i = k; i < input.length; i++) {
            if(input[i] < maxHeap.peek()) {
                maxHeap.remove();
                maxHeap.offer(input[i]);
            }
        }
        for (Integer integer : maxHeap) {
            result.add(integer);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] input = new int[]{4,5,1,6,2,7,3,8};
        ArrayList<Integer> result = Math_1.getLeastNumbers(input,5);
        for(Integer i: result) {
            System.out.println(i);
        }
     }
}
