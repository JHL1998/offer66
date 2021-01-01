package com.luojianhua.day1;

import java.util.Stack;

/**
 * create by luojianhua
 * 剑指offer09、用两个栈实现队列
 */
public class Main5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {

        stack1.push(node);
    }

    public int pop() {

        if(stack2.isEmpty()){
            if(stack1.isEmpty()) return -1;
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
