package com.luojianhua.day6;

/**
 * 删除链表中重复的节点
 */
public class Main56 {
    public ListNode deleteDuplication(ListNode head)
    {
        if(head==null||head.next==null) return head;
         ListNode next=head.next;
        if (head.val == next.val) {
            while(next!=null&&head.val==next.val){
                next=next.next;
            }
            head=deleteDuplication(next);
        }else{
            head.next=deleteDuplication(next);
        }
        return head;
    }
}
