package com.luojianhua.day6;

/**
 * create by luojianhua
 */
public class Main1 {
    /**
     * 浪漫相遇问题
     * 假设链表A的长度为a，链表B的长度为b，且两者交集的长度为c
     *
     * 即如果有交集的话，a+c+b=b+c+a
     *
     * 如果没有交集 a+b=b+a
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        ListNode l1=headA,l2=headB;
        while(l1!=l2){
            l1=l1==null?headB:l1.next;
            l2=l2==null?headA:l2.next;
        }
        return l1;
    }
}
