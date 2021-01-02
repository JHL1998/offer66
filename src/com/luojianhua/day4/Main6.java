package com.luojianhua.day4;

import java.util.*;
/**
 * create by luojianhua
 * 剑指offer37、序列化二叉树
 */
public class Main6 {

    /**
     * 采用前序遍历进行序列化与反序列化，节点之间用','分隔
     */
    private StringBuilder sb=new StringBuilder();
    public String serialize(TreeNode root) {
        dfs_s(root);
        return sb.toString();
    }
    private void dfs_s(TreeNode root){
        if(root==null){
            sb.append("null").append(",");
            return ;
        }
        sb.append(root.val).append(",");
        dfs_s(root.left);
        dfs_s(root.right);
    }

    public TreeNode deserialize(String data) {
        String strs[]=data.split(",");
        List<String>list=new ArrayList<>(Arrays.asList(strs));
        return dfs_d(list);
    }
    private TreeNode dfs_d(List<String>list){
        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        TreeNode root=new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left=dfs_d(list);
        root.right=dfs_d(list);
        return root;
    }
}
