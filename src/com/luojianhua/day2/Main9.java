package com.luojianhua.day2;

/**
 * create by luojianhua
 * 剑指offer21、调整数组顺序使奇数位于偶数前面
 */
public class Main9 {
    public int[] exchange(int[] nums) {
            int l=0,r=nums.length-1;
            while(l<r){
                while(l<r&&nums[l]%2==1) l++;
                while(l<r&&nums[r]%2==0)r--;
                if(l<r)swap(nums,l,r);
            }
            return nums;
    }
    private void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
