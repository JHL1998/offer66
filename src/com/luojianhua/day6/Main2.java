package com.luojianhua.day6;

/**
 * create by luojianhua
 * 剑指offer53、在排序数组中查找数字I
 */
public class Main2 {
    /**
     * 同时利用二分查找左边界和右边界
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int l=0,r=nums.length;
        while(l<r){
            int mid=(l+r)>>1;
            if(nums[mid]<target) l=mid+1;
            else r=mid;
        }
        if(l==nums.length||nums[l]!=target) return 0;
        int left=l;
        l=0;
        r=nums.length;
        while(l<r){
            int mid=(l+r)>>1;
            if(nums[mid]>target) r=mid;
            else l=mid+1;
        }
        //l-1-left+1
        return l-left;
    }
}
