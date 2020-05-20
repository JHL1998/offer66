package com.luojianhua.day3;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class Main24 {
    /**
     * dfs+回溯
     * @param root
     * @param target
     * @return
     */
    private ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
            dfs(root,target,new ArrayList<>());
            return res;
    }
    private void dfs(TreeNode root, int target, List<Integer> list){
         if(root==null) return ;
         list.add(root.val);
         target-=root.val;
         if(root.left==null&&root.right==null&&target==0) res.add(new ArrayList<>(list));
         dfs(root.left,target,list);
         dfs(root.right,target,list);
         list.remove(list.size()-1);

    }
}
