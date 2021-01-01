package com.luojianhua.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * create by luojianhua
 * 剑指offer06、从尾到头打印链表
 */
public class Main3 {
    /**
     * 利用栈将链表反转
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        List<Integer> list=new ArrayList<>();
        Stack<ListNode> stack=new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop().val);
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++) res[i]=list.get(i);
        return res;
    }
}
