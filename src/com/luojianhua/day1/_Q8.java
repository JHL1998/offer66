package com.luojianhua.day1;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class _Q8 {

    /**
     * dp 自底向上
     * @param n
     * @return
     */
    public int JumpFloor(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

class _Q8_2{

    /**
     * 优化空间复杂度，与斐波那契数列类似
     * @param n
     * @return
     */
    public int JumpFloor(int n) {
          if(n==0) return 1;
          if(n<=2) return n;
          int first=1;
          int second=2;
          for(int i=3;i<=n;i++){
              int sum=first+second;
              first=second;
              second=sum;
          }
          return second;
    }
}

