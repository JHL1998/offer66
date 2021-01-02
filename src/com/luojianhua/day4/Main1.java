package com.luojianhua.day4;

import java.util.*;

/**
 * create by luojianhua
 * 剑指offer32-III、从上到下打印二叉树III
 */
public class Main1 {
    /**
     * 设置一个标志位，区分是奇数层还是偶数层
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int count=0;
        while(!queue.isEmpty()){
            int n=queue.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode cur=queue.poll();
                list.add(cur.val);
                if(cur.left!=null) queue.add(cur.left);
                if(cur.right!=null) queue.add(cur.right);
            }
            if(count%2==1) Collections.reverse(list);
            count++;
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}
