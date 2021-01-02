package com.luojianhua.day3;

/**
 * create by luojianhua
 * 剑指offer24、翻转链表
 */
public class Main1 {
    /**
     * 迭代翻转
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode newNode=null,cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=newNode;
            newNode=cur;
            cur=next;
        }
        return newNode;
    }
}
