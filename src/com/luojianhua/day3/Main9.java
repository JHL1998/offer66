package com.luojianhua.day3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * create by luojianhua
 * 剑指offer32、从上到下打印二叉树
 */
public class Main9 {
    /**
     * 层序遍历
     * @param root
     * @return
     */
    public int[] levelOrder(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return new int[0];
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            list.add(cur.val);
            if(cur.left!=null) queue.add(cur.left);
            if(cur.right!=null) queue.add(cur.right);

        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++) res[i]=list.get(i);
        return res;
    }
}
