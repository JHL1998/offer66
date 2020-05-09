package com.luojianhua.day3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 */
public class Main22 {
    /**
     * 层序遍历
     * @param root
     * @return
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
           if(root==null) return new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            res.add(cur.val);
            if(cur.left!=null) queue.add(cur.left);
            if(cur.right!=null) queue.add(cur.right);
        }
        return res;
    }
}
