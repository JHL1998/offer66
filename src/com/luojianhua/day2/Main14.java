package com.luojianhua.day2;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Main14 {
    /**
     * 利用快慢指针，先让快指针走k步，然后两个指针一起走，
     * 当快指针走到最后一个节点时，慢指针的位置就是倒数第k个节点
     * 这里由于输入可能k>链表的长度
     * 我们首先要先求出链表长度
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null) return null;
        if(count(head)<k) return null;
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    /**
     * 求链表长度
     * @param head
     * @return
     */
    private int count(ListNode head){
        int res=0;
        while(head!=null){
            res++;
            head=head.next;
        }
        return res;
    }
}
