package com.luojianhua.day4;

/**
 * create by luojianhua
 * 剑指offer33、二叉搜索树的后序遍历序列
 */
public class Main2 {
    /**
     * 二叉树后序遍历中最后一个树为根节点，利用BST特性，利用根节点分成左右子树
     * 其中小于根节点的为左子树，大于根节点的为右子树
     * @param postorder
     * @return
     */
    public boolean verifyPostorder(int[] postorder) {
        return helper(postorder,0,postorder.length-1);
    }
    private boolean helper(int[]post,int l,int r){
        if(l>=r) return true;
        int value=post[r];
        int k=l;
        while(post[k]<value) k++;
        for(int i=k;i<r;i++){
            if(post[i]<value) return false;
        }
        return helper(post,l,k-1)&&helper(post,k,r-1);
    }
}
