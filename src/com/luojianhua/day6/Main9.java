package com.luojianhua.day6;

/**
 * create by luojianhua
 * 剑指offer57、和为s的两个数字
 */
public class Main9 {
    /**
     * 双指针查找
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]==target) return new int[]{nums[l],nums[r]};
            else if(nums[l]+nums[r]>target) r--;
            else l++;
        }
        return new int[]{-1,-1};
    }
}
