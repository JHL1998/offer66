package com.luojianhua.day2;

/**
 * create by luojianhua
 * 剑指offer15、二进制中1的个数
 */
public class Main3 {
    /**
     * n&=(n-1)的目标是将最右边的1变成0，能进行多少次操作就代表有多少个1
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            n&=(n-1);
            res++;
        }
        return res;
    }
}
