package com.luojianhua.day3;

import java.util.Stack;

/**
 * create by luojianhua
 * 剑指offer31、栈的压人、弹出序列
 */
public class Main8 {
    /**
     * 用一个栈去模拟压入弹出的过程
     * @param pushed
     * @param popped
     * @return
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int n=pushed.length;
        int j=0;
        for(int num:pushed){
            stack.push(num);
            while(!stack.isEmpty()&&j<n&&stack.peek()==popped[j]){
                stack.pop();
                j++;
            }

        }
        return j==n;
    }
}
