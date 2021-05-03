package com.kly.ants.algorithm.tree;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description: 构建的小根堆
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/12/14 16:17
 */
public class HeapOperator {

    public static void main(String[] args) {
//        int[] array = new int[]{10,40,30,60,90,70,20,50,80};
        int[] array = new int[]{7,1,3,10,5,2,8,9,6};

        //构建二叉堆
        buildHeap(array);
        System.out.println(Arrays.toString(array));

        //二叉堆的插入操作
        array = addArray(array,4);
        System.out.println(Arrays.toString(array));
        upAdjust(array);


        System.out.println(Arrays.toString(array));


    }

    public static int[] addArray(int[] oldarray,int ele) {
        int[] newArray = Arrays.copyOf(oldarray,oldarray.length+1);
        newArray[newArray.length-1] = ele;
        return newArray;
    }

    /**
     * 构建二叉堆
     * @param array
     */
    public static void buildHeap(int[] array) {
        //从最后一个非叶子节点开始 ,即最后一个元素的父节点，因为其它结点没有子节点，就无所谓进行下沉操作了
        //array.length-1  最后一个元素的位置，在 -1 计算父节点的值
        for (int i = (array.length-2)/2; i >=0 ; i--) {
            downAdjust(array,i,array.length);
        }
    }



    /**
     *  下沉操作（删除操作，构建堆）
     * @param array  待调整的堆
     * @param parentIndex   要下沉的父节点
     * @param length  堆的有效大小
     */
    public static void downAdjust(int[] array,int parentIndex,int length) {
        int temp = array[parentIndex];
        int childIndex = 2*parentIndex + 1;
        //沉最终可以下沉到叶子节点，所以极限值就是孩子节点的大小大于数组总长度
        while(childIndex < length) {
            //找到2个孩子节点中的最小值
            if(childIndex +1 < length && array[childIndex + 1] < array[childIndex]) {
                childIndex ++;
            }
            //如果父节点小于左右孩子节点，则跳出，因为已经满足最小堆的算法
            if(temp <= array[childIndex]) {
                break;
            }
            //无需真正交换，单向赋值即可
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2*parentIndex +1;
        }
        array[parentIndex] =  temp;
    }


    /**
     *  上浮操作 （先插入元素进行上浮操作）
     * @param array
     */
    public static void upAdjust(int[] array) {
        //获取最后一个元素的位置
        int childIndex = array.length -1;
        //父节点的获取，不管最后一个节点是左节点还是右节点，其值都为父节点，因为int结果为取整数
        int parentIndex = (childIndex -1)/2;
        // temp保存插入的叶子节点值，用于最后的赋值
        int temp = array[childIndex];
        //上浮最终可以上浮到根节点，所以极限值就是数组的第一个位置0
        while (childIndex > 0 && temp < array[parentIndex]){

            //无需真正交换，单向赋值即可
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (childIndex-1)/2;
        }
        array[childIndex] = temp;
    }


}
