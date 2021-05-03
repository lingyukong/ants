package com.kly.ants.algorithm.stack;

import java.util.Stack;

/**
 * Description:
 * Company:changyou
 *  用栈实现队列
 * @author konglingyu
 * @Date 2020/2/11 10:38
 */
public class Stack1 {
    private static Stack<Integer> stackA = new Stack<Integer>();
    private static Stack<Integer> stackB = new Stack<Integer>();


    public static void pushStack(int data) {
        stackA.push(data);
    }

    public static Integer popStack() {
        if(stackA.isEmpty() && stackB.isEmpty()) {
            return null;
        }
        if(!stackA.isEmpty()){
            transfer(stackA,stackB);
        }
        return stackB.pop();
    }


    public static void transfer(Stack<Integer> stackA,Stack<Integer> stackB) {
        while(!stackA.isEmpty()) {
            stackB.push(stackA.pop());
        }
    }

    public static void main(String[] args) {
        Stack1.pushStack(5);
        Stack1.pushStack(4);
        Stack1.pushStack(3);
        Stack1.pushStack(2);
        System.out.println(Stack1.popStack());
        System.out.println(Stack1.popStack());
        System.out.println(Stack1.popStack());
        Stack1.pushStack(1);
        System.out.println(Stack1.popStack());
        System.out.println(Stack1.popStack());

    }

}
