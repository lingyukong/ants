package com.kly.ants.algorithm.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/3/1 17:21
 */
public class Test {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1,1);
    }

    private static Stack<Integer> mainStack = new Stack();
    private static Stack<Integer> minStack = new Stack();

    /**
     * 入栈
     * @param num
     */
    public static void push(int num) {
        if(minStack.empty()) {
            minStack.push(num);
        }
        if (num <= minStack.peek()) {
            minStack.push(num);
        }
        mainStack.push(num);
    }

    /**
     * 出栈
     */
    public static  int pop() throws Exception {
        if(mainStack.empty() && minStack.empty()){
            throw new Exception("stack is empty");
        }
        if(mainStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        return mainStack.pop();
    }


    public static int getMinValue() throws Exception{
        if(minStack.empty()) {
            throw new Exception("stack is empty");
        }
        return minStack.pop();
    }


}
