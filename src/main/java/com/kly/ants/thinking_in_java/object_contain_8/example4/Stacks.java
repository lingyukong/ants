package com.kly.ants.thinking_in_java.object_contain_8.example4;

import java.util.Stack;

/**
 * <p>Description:
 * 1:Stack继承Vector,能对Vector进行的操作亦可针对Stack 进行，例如 elementAt()方法
 * 2:Stack后入先出（LIFO）集合,我们在堆栈里最后“压入”的东西将是以后第一个“弹出”的
 * 3:stack继承Vector这种设计是不好的，stack的进栈和出栈是复用vector的方法实现的，但是vector是可以在任何位置插入数据的，
 *   但是栈只能在栈顶添加或者删除元素。如果数据量不是很大，数组的实现反而会更快些，而且vector是线程安全的。
 * 4：几乎所有语言在实现栈的时候，都会实现进栈和出栈，而栈这种数据结构在多数时候用来插入和删除元素（进栈则是在顶部插入元素，出栈则是从顶部删除元素），
 *    较少情况会用来查找元素。所以从实现方式上，大多是以链表方式实现而非数组方式实现（在插入删除方法上，链表效率优于数组效率）
 * 5：Deque 接口及其实现提供了 LIFO 堆栈操作的更完整和更一致的 set，应该优先使用此 set，而非此类。例如：
      Deque<Integer> stack = new ArrayDeque<Integer>();
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/24 11:12
 * @see DequeTest
 */
public class Stacks {
    static String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December" };


    public static void main(String[] args) {
        Stack stk = new Stack();
        for(int i = 0; i < months.length; i++){
            stk.push(months[i] + " ");
        }
        System.out.println("stk = " + stk);

        // Treating a stack as a Vector:
        stk.addElement("The last line");
        System.out.println(
                "element 5 = " + stk.elementAt(5));
        System.out.println("popping elements:");
        while(!stk.empty()) {
            System.out.println(stk.pop());
        }
    }
}
