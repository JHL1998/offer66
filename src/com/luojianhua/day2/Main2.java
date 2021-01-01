package com.luojianhua.day2;

/**
 * create by luojianhua
 * 剑指offer14-II、剪绳子II
 */
public class Main2 {
    /**
     * 与上一题一样
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        if(n<=3) return n-1;
        long res=1L;
        int MOD=(int)(1e9)+7;
        while(n>4){
            res=(res*3)%MOD;
            n-=3;
        }
        return (int)((n*res)%MOD);
    }
}
