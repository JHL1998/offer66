package com.luojianhua.day3;

import java.util.Stack;

/**
 * create by luojianhua
 * 剑指offer30、包含Min函数的栈
 */
public class Main7 {


    Stack<Integer> stack1;
    Stack<Integer>stack2;

     public  Main7(){
      stack1=new Stack<>();
      stack2=new Stack<>();
  }

    public void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty()) stack2.push(x);
        else stack2.push(Math.min(x,stack2.peek()));
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
