package com.luojianhua.day1;



/**
 * create by luojianhua
 * 剑指offer07、重建二叉树
 */
public class Main4 {


    /**
     *     1
     *    / \
     *   2   3
     *   / \ / \
     *  4  5 6 7
     *  如图所示，此时 前序遍历结果应该为[1,2,4,5,3,6,7]
     *               中序遍历结果为[4,2,5,1,6,3,7]
     *            很明显的是根节点为前序遍历的第一个节点 此时这个节点在中序遍历的中间
     *            那么前序遍历的[2,4,5] 和[3,6,7] 分别对应了他的左子树和右子树
     *            中序遍历的[4,2,5]和[6,3,7] 对应了左子树和右子树
     *            此时我们再对 前序遍历的第一个节点2进行构造,即为根节点的左子树
     *            递归调用。就可以恢复出这棵树
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode reConstructBinaryTree(int [] preorder, int [] inorder) {

      return dfs(preorder,inorder,0,preorder.length-1,0,inorder.length-1);

    }

    /**
     * 此时l,r分别代表前序遍历的左右区间端点
     * left,right分别代表中序遍历的左右端点
     * @param preorder
     * @param inorder
     * @param l
     * @param r
     * @param left
     * @param right
     * @return
     */
    private TreeNode dfs(int[]preorder,int[]inorder,int l,int r,int left, int right){
        if(l>=preorder.length||left>=inorder.length||l>r||left>right) return null;
        int value=preorder[l];
      TreeNode root=new TreeNode(value);
      int count=left;
      //寻找根节点在中序遍历的位置
      while(inorder[count]!=value) count++;
      count-=left;

      root.left=dfs(preorder,inorder,l+1,l+count,left,left+count-1);
      root.right=dfs(preorder,inorder,l+count+1,r,left+count+1,right);
      return root;

    }
}
