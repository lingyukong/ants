package com.kly.ants.algorithm.math.subsequence;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * Description:
 * Company:changyou
 * 求最大子序列的和[既然是子序列，那就表示是连续的]---穷举法
 *
 * @author konglingyu
 * @Date 2021/2/1 11:08
 */
public class Exhaustion {
    public static void main(String[] args) {
//        int[] arr = new int[]{3,4,6,-2,5};
        int[] arr = new int[]{-3,-4,-6,-2,-5};
        System.out.println(method_exhaustion(arr));
        System.out.println(dynamic_method(arr));
    }



    public static int method_exhaustion(int[] arr) {
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int thisSum= 0;
            for (int j = i; j < arr.length; j++) {
                thisSum += arr[j];
                if (maxSum < thisSum) {
                    maxSum = thisSum;
                }
            }
        }

        return maxSum;
    }

    public static int dynamic_method(int[] arr) {
        for(int i=0;i<arr.length;i++) {
           if(i>0 && arr[i-1] >0) {
               arr[i]+=arr[i-1];
           }
        }
        return Arrays.stream(arr).max().getAsInt();  //获得数组中的最大值
    }
}
