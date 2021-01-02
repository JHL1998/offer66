package com.luojianhua.day3;

/**
 * create by luojianhua
 * 剑指offer28、对称的二叉树
 */
public class Main5 {
    /**
     * 直接判断两颗树是否对称
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return helper(root,root);
    }
    private boolean helper(TreeNode s,TreeNode t){
        if(s==null&&t==null) return true;
        if(s==null||t==null||s.val!=t.val) return false;
        return helper(s.left,t.right)&&helper(s.right,t.left);
    }
}
