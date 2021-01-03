package com.luojianhua.day6;

/**
 * create by luojianhua
 * 剑指offer56-II、数组中数字出现的次数II
 */
public class Main8 {
    /**
     * 对于每一个bit，统计出数组nums中该bit共出现cnt1次，cnt1%3即单独数在该bit是1还是0.
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=31;i>=0;i--){
            int count=0;
            for(int num:nums){
                if((num>>i&1)==1) count++;

            }
            if(count%3==1) res=res*2+1;
            else res=res*2;
        }
        return res;
    }
}
