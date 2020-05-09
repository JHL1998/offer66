package com.luojianhua.day2;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 */
public class Main20 {

    /**
     * 利用两个栈，第一个为正常栈，第二个为最小栈
     */
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
        if (stack2.isEmpty()) {
            //如果为空，往里面push
            stack2.push(node);
        } else {
            //不为空的时候，比较 栈顶元素和将push的元素
            stack2.push(Math.min(node, stack2.peek()));
        }
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
