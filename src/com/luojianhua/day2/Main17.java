package com.luojianhua.day2;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 */
public class Main17 {
    /**
     * 递归做法
     * @param s
     * @param t
     * @return
     */
    public boolean HasSubtree(TreeNode s,TreeNode t ) {
        if(s==null||t==null) return false;
        return isSame(s,t)||HasSubtree(s.left,t)||HasSubtree(s.right,t);

    }
    private boolean isSame(TreeNode s,TreeNode t){
        if(t==null) return true;
        if(s==null) return false;
        if(s.val!=t.val) return false;
        return isSame(s.left,t.left)&&isSame(s.right,t.right);
    }
}
