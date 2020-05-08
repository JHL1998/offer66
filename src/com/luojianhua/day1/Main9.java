package com.luojianhua.day1;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Main9 {
    /**
     * dp[n]=2*dp[n-1];
     * @param n
     * @return
     */
    public int JumpFloorII(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=2*dp[i-1];
        }
        return dp[n];

    }

}
