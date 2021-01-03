package com.luojianhua.day6;

/**
 * create by luojianhua
 * 剑指offer55-II、平衡二叉树
 */
public class Main6 {
    /**
     * 与上一题类似，计算树的高度
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        return getHeight(root)>=0;
    }
    private int getHeight(TreeNode root){
        if(root==null)return 0;
        int l=getHeight(root.left);
        int r=getHeight(root.right);
        if(l>=0&&r>=0&&Math.abs(l-r)<=1) return Math.max(l,r)+1;
        return -1;
    }
}
