package com.luojianhua.day2;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Main15 {

    /**
     * 非递归做法
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode newNode=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=newNode;
            newNode=head;
            head=temp;
        }
        return newNode;
    }
}

 class Main15_1 {

    /**
     * 递归做法
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
         if(head==null||head.next==null) return null;
         ListNode newNode=ReverseList(head.next);
         head.next.next=head;
         head.next=null;
         return newNode;
    }
}
