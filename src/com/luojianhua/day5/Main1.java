package com.luojianhua.day5;



/**
 * create by luojianhua
 * 剑指offer42、数据流中的中位数
 */
public class Main1 {
    /**
     * f[i]代表前i个数的子数组的最大和，由于只用到了上一个变量，本题可以用滚动数组优化
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int f[]=new int[n];
        f[0]=nums[0];
        int res=nums[0];
        for(int i=1;i<n;i++){
            if(f[i-1]<=0) f[i]=nums[i];
            else f[i]=f[i-1]+nums[i];
            res=Math.max(f[i],res);
        }
        return res;
    }
}
