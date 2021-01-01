package com.luojianhua.day1;

/**
 * create by luojianhua
 * 剑指offer03、数组中重复的数字
 */
public class Main0 {
    /**
     * 将每一个数都放在正确的位置上。例如0号位置对应0，1号位置对应1
     * 如果先前已经出现该数字，代表该数字就是重复出现的数字。
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        int n=nums.length;
        for(int num:nums){
            if(num<0||num>n-1) return -1;
        }
        for(int i=0;i<n;i++){
            while(i!=nums[i]){
                if(nums[i]==nums[nums[i]]) return nums[i];
                swap(nums,i,nums[i]);
            }

        }
        return -1;

    }
    private void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
