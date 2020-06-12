package com.luojianhua.day7;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8） 中，
 * 按结点数值大小顺序第三小结点的值为4。
 */
public class Main62 {
    private List<TreeNode> list=new ArrayList<>();
    TreeNode KthNode(TreeNode root, int k)
    {
        if(k<=0) return null;
        inOrder(root);
        if(k> list.size()) return null;
        return list.get(k-1);

    }
    private void inOrder(TreeNode node){
        if(node==null) return ;
        inOrder(node.left);
        list.add(node);
        inOrder(node.right);
    }
}
