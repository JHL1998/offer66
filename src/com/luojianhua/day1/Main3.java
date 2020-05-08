package com.luojianhua.day1;

import java.util.ArrayList;

public class Main3 {

    /**
     * 一个很简单的思路，我们直接利用递归反转链表，然后遍历整个链表，将起添加进集合中
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res=new ArrayList<>();
        ListNode node=reverse(listNode);
        while(node!=null){
            res.add(node.val);
            node=node.next;
        }
        return res;

    }
    private ListNode reverse(ListNode head){

        if(head==null||head.next==null) return  head;
        ListNode newNode=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
}
