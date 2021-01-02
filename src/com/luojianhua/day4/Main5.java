package com.luojianhua.day4;

/**
 * create by luojianhua
 * 剑指offer36、二叉搜索树与双向链表
 */
public class Main5 {

    private static class Node{
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    /**
     * 二叉搜索树中序遍历为排序数
     */
    private Node pre=null,head=null;
    public Node treeToDoublyList(Node root) {
        if(root==null) return null;
        inOrder(root);
        head.left=pre;
        pre.right=head;
        return head;
    }
    private void inOrder(Node root){
        if(root==null) return ;
        inOrder(root.left);
        root.left=pre;
        if(pre!=null){
            pre.right=root;
        }else head=root;
        pre=root;
        inOrder(root.right);

    }
}
