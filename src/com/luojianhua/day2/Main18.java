package com.luojianhua.day2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Main18 {

    /**
     * 非递归做法，层序遍历，交换位置
     * @param root
     */
    public void Mirror(TreeNode root) {
        if(root==null) return ;
       Queue<TreeNode> queue=new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
           TreeNode cur=queue.poll();
           TreeNode temp=cur.right;
           cur.right=cur.left;
           cur.left=temp;
           if(cur.left!=null) queue.add(cur.left);
           if(cur.right!=null) queue.add(cur.right);
       }

    }
}

class Main18_1 {

    /**
     * 递归做法
     * @param root
     */
    public void Mirror(TreeNode root) {
        if(root==null) return ;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
