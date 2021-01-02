package com.luojianhua.day3;


/**
 * create by luojianhua
 * 剑指offer22、链表中倒数第k个节点
 */
public class Main0 {
    /**
     * 快慢指针，快指针先走k步，然后两个指针一起走，当快指针走到终点时，慢指针所在的下一个节点即为倒数第k个节点
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        while(k-->0)  fast=fast.next;
        while(fast!=null&&fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.next;
    }
}
