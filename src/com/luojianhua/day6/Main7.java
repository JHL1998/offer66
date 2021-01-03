package com.luojianhua.day6;

/**
 * create by luojianhua
 * 剑指offer56-I、数组中数字出现的次数
 */
public class Main7 {
    public int[] singleNumbers(int[] nums){
        //假设两个只出现过一次的数分别为x,y
        int sum=0;
        // x,y异或之和，并且两数不相等，即x^y!=0
        for(int num:nums) sum^=num;

        //如果x^y不为0，那么sum的二进制中至少有一位为1
        int k=0;
        while(((sum>>k)&1)==0) k++;
        //此时第k位为1，我们根据第k位为0  or  1，分为两个集合
        int first=0;
        for(int num:nums){
            //first 为第一个只出现过一次的数
            if(((num>>k)&1)==0) first^=num;
        }
        return new int[]{first,first^sum};

    }
}
