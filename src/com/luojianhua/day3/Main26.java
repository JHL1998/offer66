package com.luojianhua.day3;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Main26 {
    private TreeNode pre;
    public TreeNode Convert(TreeNode root){
         inOrder(root);
         while(pre!=null&&pre.left!=null) pre=pre.left;
                 return pre;

    }
    private void inOrder(TreeNode root){
        if(root==null) return ;
        inOrder(root.left);

        root.left=pre;
        if(pre!=null) pre.right=root;

        pre=root;
        inOrder(root.right);
    }
}
