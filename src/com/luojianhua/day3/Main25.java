package com.luojianhua.day3;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针
 * ，一个指向下一个节点，另一个特殊指针random指向一个随机节点），
 * 请对此链表进行深拷贝，并返回拷贝后的头结点。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Main25 {
    /**
     * 利用哈希表
     * @param head
     * @return
     */
    Map<RandomListNode,RandomListNode> map=new HashMap<>();
    public RandomListNode Clone(RandomListNode head)
    {
         if(head==null) return head;
         RandomListNode copy=new RandomListNode(head.label);
         if(map.containsKey(head)) return map.get(head);
         map.put(head,copy);
         //递归过程
         copy.next=Clone(head.next);
         copy.random=Clone(head.random);
         return copy;
    }
}


