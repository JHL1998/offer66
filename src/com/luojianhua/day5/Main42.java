package com.luojianhua.day5;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class Main42 {
    /**
     * 由于数组有序，第一次找到的一定是最外层的，即乘积最小，找到后直接退出即可。
     * @param nums
     * @param sum
     * @return
     */
    public ArrayList<Integer> FindNumbersWithSum(int [] nums, int sum) {

        ArrayList<Integer>res=new ArrayList<>();
        if(nums.length==0) return res;
        int l=0,r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]==sum){
                res.add(nums[l]);
                res.add(nums[r]);
                break;
            }
            else if(nums[l]+nums[r]>sum) r--;
            else l++;
        }
        return res;

    }
}
