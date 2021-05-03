package com.kly.ants.thinking_in_java.object_contain_8.example7;

import java.util.Vector;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  程序设计一个主要的目标就是“将发生变化的东西同保持不变的东西分隔开”。
 *  在这里，保持不变的代码是通用的排序算法，而每次使用时都要变化的是对象的实际比较方法
 *  采用“回调”技术。利用回调，经常发生变化的那部分代码会封装到它自己的类内，而总是保持相同的代码则“回调”发生变化的代码，这样一来，不同的对象就可以表达不同的比较
    方式，同时向它们传递相同的排序代码
 * @author kly
 * @Date 2018/2/28 10:11
 * @see
 */
public class SortVector extends Vector {
    private Compare compare; //To hold the callback

    public SortVector(Compare comp) {
        compare = comp;
    }

    public void sort() {
        quickSort(0, size() - 1);
    }
    /**
     * 快速排序
     * @param left
     * @param right
     */
    private void quickSort(int left, int right) {
        if(right > left) {
            Object o1 = elementAt(right);
            int i = left - 1;
            int j = right;
            while(true) {
                while(compare.lessThan(elementAt(++i), o1))
                    ;
                while(j > 0) {
                    if(compare.lessThanOrEqual(
                            elementAt(--j), o1))  {
                        break; // out of while
                    }
                }
                if(i >= j)  {
                    break;
                } else {
                    swap(i, j);
                }
            }
            swap(i , right);
            quickSort(left, i-1);
            quickSort(i+1, right);
        }
    }

    private void swap(int loc1, int loc2) {
        Object tmp = elementAt(loc1);
        setElementAt(elementAt(loc2), loc1);
        setElementAt(tmp, loc2); //setElementAt(E obj, int index)将此向量指定 index 处的组件设置为指定的对象
    }
}
