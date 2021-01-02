package com.luojianhua.day3;

/**
 * create by luojianhua
 * 剑指offer26、树的子结构
 */
public class Main3 {
    /**
     * 三种情况
     * 1、 S==T
     * 2、S的左子树=T
     * 3、S的右子树=T
     * @param s
     * @param t
     * @return
     */
    public boolean isSubStructure(TreeNode s, TreeNode t) {
        if(s==null||t==null) return false;
        return helper(s,t)||isSubStructure(s.left,t)||isSubStructure(s.right,t);

    }

    /**
     * 判断S与T是否相等
     * @param s
     * @param t
     * @return
     */
    private boolean helper(TreeNode s,TreeNode t){
        if(t==null) return true;
        if(s==null||s.val!=t.val) return false;
        return helper(s.left,t.left)&&helper(s.right,t.right);
    }
}
