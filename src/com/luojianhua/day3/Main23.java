package com.luojianhua.day3;

/**
 * 输入一个非空整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Main23 {
    public boolean VerifySquenceOfBST(int []nums){
         if(nums.length==0) return false;
         return dfs(nums,0,nums.length-1);
    }

    /**
     * 递归查找，二叉搜索树的根节点为后序遍历最后一个元素
     * 并且此时除了根节点的元素会分成左右两部分，左边左子树的元素全部都小于根节点
     * 右边右子树的元素全部都大于根节点
     * @param nums
     * @param l
     * @param r
     * @return
     */
    private boolean dfs(int[]nums,int l,int r){
          if(l>=r) return true;
          int root=nums[r];
          int k=l;
          //找到k的位置，k为第一个大于根节点位置的元素
          while(k<r&&nums[k]<root) k++;
          for(int i=k;i<r;i++){
              //如果右子树元素小于根节点，直接返回false
              if(nums[i]<root) return false;
          }
          return dfs(nums,l,k-1)&&dfs(nums,k,r-1);
    }


}
