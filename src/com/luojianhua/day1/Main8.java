package com.luojianhua.day1;

/**
 * create by luojianhua
 * 剑指offer11、旋转数组的最小数字
 */
public class Main8 {
    /**
     * 二分法，画个草图一目了然
     * @param nums
     * @return
     */
    public int minArray(int[] nums) {
        int n=nums.length-1;
        while(n>0&&nums[0]==nums[n]) n--;
        if(nums[0]<=nums[n]) return nums[0];
        int l=0,r=n;
        while(l<r){
            int mid=(l+r)>>1;
            if(nums[mid]<nums[0]) r=mid;
            else l=mid+1;
        }
        return nums[l];
    }
}
