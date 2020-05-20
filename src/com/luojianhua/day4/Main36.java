package com.luojianhua.day4;

import java.util.HashSet;
import java.util.Set;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，
 * 保证传入数据是正确的
 */
public class Main36 {
    /**
     * 利用set集合去重
     * @param headA
     * @param headB
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        Set<ListNode> set=new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(set.contains(headB)) return headB;
            headB=headB.next;
        }
        return null;
    }
}
