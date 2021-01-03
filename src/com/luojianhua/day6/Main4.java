package com.luojianhua.day6;

/**
 * create by luojianhua
 * 剑指offer54、二叉搜索树的第K大节点
 */
public class Main4 {
    /**
     *寻找第K大节点，那么可以按照右子树->左子树的方式来中序遍历
     */
    private int res=0,count=0;
    public int kthLargest(TreeNode root, int k) {
        inOrder(root,k);
        return res;
    }
    private  void inOrder(TreeNode root,int k){
        if(root==null) return ;
        inOrder(root.right,k);
        count++;
        if(count==k){
            res=root.val;
        }
        inOrder(root.left,k);
    }
}
