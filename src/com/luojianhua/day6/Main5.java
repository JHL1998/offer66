package com.luojianhua.day6;

/**
 * create by luojianhua
 * 剑指offer55、二叉树的深度
 */
public class Main5 {
    /**
     * 递归求解
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
