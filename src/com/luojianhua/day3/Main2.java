package com.luojianhua.day3;

/**
 * create by luojianhua
 * 剑指offer25、合并两个排序的链表
 */
public class Main2 {
    /**
     * 归并排序中合并的思想
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                cur.next=l1;
                l1=l1.next;
            }else{
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        if(l1!=null) cur.next=l1;
        if(l2!=null)cur.next=l2;
        return dummy.next;
    }
}
