package com.kly.ants.algorithm.tree;

import java.util.Arrays;

/**
 * Description:实现最大优先队列
 * 实现入队enQueue和出队deQueue
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/12/25 11:27
 */
public class PriorityQueue {
    public static void main(String[] args) throws Exception {
        PriorityQueue queue = new PriorityQueue();
        queue.enQueue(5);
        queue.enQueue(8);
        queue.enQueue(3);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }

    private int[] array;
    private int size;//相当于指针

    public PriorityQueue() {
        array = new int[32];
    }

    public void resize(){
        int newIndex = 2 * size;
        array = Arrays.copyOf(array,newIndex);
    }
    /**
     * 入队操作  --二叉堆的插入操作
     */
    public void enQueue(int ele) {
        if(size >= array.length) {
            resize();
        }
        array[size++] = ele;
        upAdjust();
    }


    /**
     * 出队操作
     */
    public int deQueue() throws Exception {
        if(size <= 0) {
            throw new Exception("the queue is empty!");
        }
        int head = array[0];
        array[0] = array[--size];
        downAdjust(0);
        return head;
    }

    /**
     * 上浮操作(二叉堆插入元素的时候使用)
     */
    public void upAdjust() {
        int childIndex = size - 1;
        int parentIndex = (childIndex - 1) / 2;

        int temp = array[childIndex];
        while (childIndex > 0 && temp > array[parentIndex]) {
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
        array[childIndex] = temp;
    }

    /**
     * 下沉操作
     */
    public void downAdjust(int parentIndex) {
        int length = size-1;
        int childIndex = 2*parentIndex +1;
        int temp = array[parentIndex];
        while(childIndex < size) {
            if(childIndex + 1<size && array[childIndex + 1] > array[childIndex]) {
                childIndex++;
            }
            if(temp >array[childIndex]) {
                break;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2*parentIndex +1;
        }
        array[parentIndex] = temp;
    }


}
