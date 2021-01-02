package com.luojianhua.day4;


/**
 * create by luojianhua
 * 剑指offer35、复杂链表的复制
 */
public class Main4 {
    /**
     * 1、将每个节点都复制一份，并且将复制的节点连接在原节点后
     * 2、将random指针正确赋值
     * 3、从头开始连接每一个复制节点
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        for(Node node=head;node!=null;){
            Node next=node.next;
            Node copy=new Node(node.val);
            node.next=copy;
            copy.next=next;
            node=next;
        }
        for(Node node=head;node!=null;node=node.next.next){
            if(node.random!=null) node.next.random=node.random.next;
        }
        Node dummy=new Node(0);
        Node cur=dummy;
        for(Node node=head;node!=null;node=node.next){
            cur.next=node.next;
            cur=node;
        }
        return dummy.next;

    }
}
