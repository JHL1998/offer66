package com.luojianhua.day3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * create by luojianhua
 * 剑指offer27、二叉树的镜像
 */
public class Main4 {
    /**
     * 通过层序遍历变成镜像
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null) return null;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            if(cur.left!=null) queue.add(cur.left);
            if(cur.right!=null) queue.add(cur.right);
            TreeNode temp=cur.left;
            cur.left=cur.right;
            cur.right=temp;
        }
        return root;
    }
}
