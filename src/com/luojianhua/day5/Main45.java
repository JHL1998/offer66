package com.luojianhua.day5;

import java.util.Arrays;

public class Main45 {
    /**
     * 把 0当成癞子用
     * @param nums
     * @return
     */
    public boolean isContinuous(int [] nums) {
        if(nums==null||nums.length==0) return false;
        int index=0;
        int count=0;
        Arrays.sort(nums);
        //统计0的个数
        while(nums[index]==0) index++;
        for(int i=index+1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) return false;
            //计算需要癞子的个数
            count+=nums[i]-nums[i-1]-1;
        }
        return count<=index;
    }
}
