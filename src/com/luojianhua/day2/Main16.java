package com.luojianhua.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Main16 {
    /**
     * 直接办法，将这两个链表加到一个集合中，然后自定义排序
     * 最后再连接起来
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null&&list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;

        List<ListNode> list=new ArrayList<>();
        while(list1!=null){
            list.add(list1);
            list1=list1.next;
        }
        while(list2!=null){
            list.add(list2);
            list2=list2.next;
        }
        list.sort((a,b)->a.val-b.val);
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
       for(ListNode node:list){
           cur.next=node;
           cur=cur.next;
       }
       return dummy.next;
    }
}
 class Main16_2 {

     /**
      *递归做法
      * @param list1
      * @param list2
      * @return
      */
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null&&list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
       if(list1.val<list2.val){
           list1.next=Merge(list1.next,list2);
           return list1;
       }else{
           list2.next=Merge(list1,list2.next);
           return list2;
       }

    }
}

class Main16_3 {

    /**
     *非递归做法
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null&&list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
       ListNode dummy=new ListNode(0);
       ListNode cur=dummy;
       while(list1!=null&&list2!=null){
           if(list1.val<list2.val){
               cur.next=list1;
               list1=list1.next;
           }else{
               cur.next=list2;
               list2=list2.next;
           }
           cur=cur.next;
       }
       while(list1!=null){
           cur.next=list1;
           list1=list1.next;
           cur=cur.next;
       }
        while(list2!=null){
            cur.next=list2;
            list2=list2.next;
            cur=cur.next;
        }
    return dummy.next;
    }
}
