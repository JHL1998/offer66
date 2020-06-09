package com.luojianhua.day4;

import java.util.PriorityQueue;

/**
 * 丑数
 */
public class Main33 {
    public int GetUglyNumber_Solution(int n) {
        if(n<=0) return 0;
        int i2=0,i3=0,i5=0;
        int dp[]=new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            dp[i]=Math.min(dp[i2]*2,Math.min(dp[i3]*3,dp[i5]*5));
            if(dp[i2]*2==dp[i]) i2++;
            if(dp[i3]*3==dp[i]) i3++;
            if(dp[i5]*5==dp[i]) i5++;

        }
        return dp[n-1];

    }
}
class Main33_2{
    public int GetUglyNumber_Solution(int n) {
        if(n<=0) return 0;
        PriorityQueue<Long>queue=new PriorityQueue<>();
        long res=1L;
        for(int i=1;i<n;i++){
            queue.add(res*2);
            queue.add(res*3);
            queue.add(res*5);
            res=queue.poll();
            while(!queue.isEmpty()&&res==queue.peek()) queue.poll();
        }
        return (int)res;

    }
}
