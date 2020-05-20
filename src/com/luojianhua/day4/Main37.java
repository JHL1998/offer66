package com.luojianhua.day4;

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Main37 {
    /**
     * 先利用二分法找出 最左边位置的元素
     * @param nums
     * @param k
     * @return
     */
    public int GetNumberOfK(int [] nums , int k) {
        int l=0,r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<k) l=mid+1;
            else r=mid;
        }
        int count=0;
        for(int i=l;i<nums.length;i++){
            if(nums[i]==k) count++;
        }
        return count;
    }
}
