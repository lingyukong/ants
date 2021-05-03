package com.kly.ants.thinking_in_java.object_contain_8.example4;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>Description:Deque实现栈结构
 *  Deque:double-ended queue:双端队列,是有下标顺序容器，它允许在其首尾两段快速插入及删除。 另外，在deque 任一端插入或删除不会非法化指向其余元素的指针或引用
 *  所有已知实现类：
     ArrayDeque, LinkedBlockingDeque, LinkedList
     ArrayDeque：用数组实现的Deque双端队列

 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/24 11:50
 * @see
 */
public class DequeTest {
    static String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December" };

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<String>();
        for (String month : months) {
            stack.push(month);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
