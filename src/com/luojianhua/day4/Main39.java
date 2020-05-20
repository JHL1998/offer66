package com.luojianhua.day4;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 *
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 */
public class Main39 {
    public boolean IsBalanced_Solution(TreeNode root) {
         return getHeight(root)>=0;
    }

    /**
     * 求树的高度
     * @param root
     * @return
     */
    private int getHeight(TreeNode root){
        if(root==null) return 0;
        int l=getHeight(root.left);
        int r=getHeight(root.right);
        if(l>=0&&r>=0&&Math.abs(l-r)<=1) return Math.max(l,r)+1;
        return -1;
    }
}
