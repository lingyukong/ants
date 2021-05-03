package com.kly.ants.algorithm.stack;

import java.util.Stack;

/**
 * Description:
 * Company:changyou
 *  最小栈的实现  实现入栈，出栈，获取栈顶元素，获取最小数，时间复杂度为O(1)
 * @author konglingyu
 * @Date 2020/2/18 17:38
 */
public class Stack2 {
    private static Stack<Integer> mainStack = new Stack<Integer>();  //Integer类型必须指定
    private static Stack<Integer> minStack = new Stack<Integer>();


    /**
     * 入栈方法
     * @param num
     */
    public static void pushStack(int num) {
        if (minStack.empty()) {
            minStack.push(num);
        }
        if(num <= minStack.peek()) {
            minStack.push(num);
        }
        mainStack.push(num);
    }


    /**
     * 出栈方法
     */
    public static int  popStack() {
        if(mainStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        return mainStack.pop();
    }

    public static int gerMinValue() throws Exception {
        if(minStack.empty()) {
            throw new Exception("stack is empty");
        }
        return minStack.pop();
    }

    public static void main(String[] args) throws Exception {
        Stack2.pushStack(4);
        Stack2.pushStack(6);
        Stack2.pushStack(2);
        Stack2.pushStack(7);
        System.out.println(Stack2.mainStack.toString());
        System.out.println(Stack2.minStack.toString());
        System.out.println(Stack2.gerMinValue());
        Stack2.popStack();
        Stack2.popStack();
        System.out.println(Stack2.gerMinValue());
    }


}
