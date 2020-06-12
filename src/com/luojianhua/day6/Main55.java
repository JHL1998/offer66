package com.luojianhua.day6;

/**
 * 链表中环的入口节点
 */
public class Main55 {
    public ListNode EntryNodeOfLoop(ListNode head) {
         if(head==null) return null;
         ListNode fast=head;
         ListNode slow=head;
         ListNode temp;
         while(fast!=null&&fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
             if(slow==fast){
                 temp=head;
                 while(temp!=slow){
                     slow=slow.next;
                     temp=temp.next;
                 }
                 return temp;
             }
         }
         return null;

    }

}
