package com.luojianhua.day4;

import java.util.*;
/**
 * create by luojianhua
 * 剑指offer34、二叉树种和为某一值的路径
 */
public class Main3 {

    /**
     * dfs+回溯
     */
    private List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return res;
        dfs(root,sum,new ArrayList<>());
        return res;
    }
    private void dfs(TreeNode root,int sum,List<Integer>list){
        if(root==null) return ;
        list.add(root.val);
        sum-=root.val;
        if(root.left==null&&root.right==null&&sum==0){
            res.add(new ArrayList<>(list));
        }


        dfs(root.left,sum,list);
        dfs(root.right,sum,list);
        list.remove(list.size()-1);
    }
}
