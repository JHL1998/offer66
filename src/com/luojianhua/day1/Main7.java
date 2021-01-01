package com.luojianhua.day1;

/**
 * create by luojianhua
 * 剑指offer10-II、青蛙跳台阶问题
 */
public class Main7 {
    /**
     * 与上一题类似
     * @param n
     * @return
     */
    public int numWays(int n) {
        if(n==0) return 1;
        if(n<=2) return n;
        int a=1,b=2;
        int MOD=((int)1e9)+7;
        for(int i=3;i<=n;i++){
            int c=(a+b)%MOD;
            a=b;
            b=c;
        }
        return b;
    }

}
