package com.luojianhua.day4;

/**
 * create by luojianhua
 * 剑指offer39、数组中出现次数超过一半的数字
 */
public class Main8 {

    /**
     * 摩尔投票法   不同的数两两抵消，超过一半的数字是抵消后剩余的数字
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int res=nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                res=nums[i];
                count=1;
            }else if(res==nums[i])count++;
            else count--;
        }
        return res;
    }
}
