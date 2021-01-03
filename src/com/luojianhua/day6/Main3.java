package com.luojianhua.day6;

/**
 * create by luojianhua
 * 剑指offer53-II、在0～n-1中缺失的数字
 *
 */
public class Main3 {
    /**
     * 二分查找
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int l=0,r=nums.length;
        while(l<r){
            //代表前面发生了错位
            int mid=(l+r)>>1;
            if(nums[mid]!=mid) r=mid;
            else l=mid+1;
        }
        return l;
    }
}
