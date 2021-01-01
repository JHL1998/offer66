package com.luojianhua.day2;

/**
 * create by luojianhua
 * 剑指offer18、删除链表中的节点
 */
public class Main6 {
    /**
     * 递归删除
     * @param head
     * @param val
     * @return
     */
    public ListNode deleteNode(ListNode head, int val) {
        if(head==null) return null;
        head.next=deleteNode(head.next,val);
        return head.val==val?head.next:head;
    }
}
