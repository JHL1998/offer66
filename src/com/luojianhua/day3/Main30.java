package com.luojianhua.day3;

/**
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class Main30 {
    /**
     * 暴力法，O(n^2)可AC
     * @param nums
     * @return
     */
    public int FindGreatestSumOfSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
             int sum=0;
             for(int j=i;j<nums.length;j++){
                 sum+=nums[j];
                 res=Math.max(res,sum);

             }
         }
         return res;
    }
}


class Main30_1 {
    /**
     * dp
     * @param nums
     * @return
     */
    public int FindGreatestSumOfSubArray(int[] nums) {
          int dp=nums[0];
          int res=dp;
          for(int i=1;i<nums.length;i++){
              if(dp<=0) dp=nums[i];
              else dp+=nums[i];
              res=Math.max(res,dp);
          }
          return res;
    }
}